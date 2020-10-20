package com.trackme.webgis.service.impl;

import com.trackme.common.constant.Constant;
import com.trackme.common.utils.R;
import com.trackme.common.vo.MapToolMenuVo;
import com.trackme.common.vo.MenuVo;
import com.trackme.common.vo.TerminalCommandMenuVo;
import com.trackme.common.vo.WebMenuVo;
import com.trackme.webgis.entity.RolefuncEntity;
import com.trackme.webgis.entity.UserinfoEntity;
import com.trackme.webgis.entity.UserroleEntity;
import com.trackme.webgis.service.LoginService;
import com.trackme.webgis.service.RolefuncService;
import com.trackme.webgis.service.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trackme.common.utils.PageUtils;
import com.trackme.common.utils.Query;

import com.trackme.webgis.mapper.FunctionmodelMapper;
import com.trackme.webgis.entity.FunctionmodelEntity;
import com.trackme.webgis.service.FunctionmodelService;

import javax.servlet.http.HttpServletRequest;


@Service
public class FunctionmodelServiceImpl extends ServiceImpl<FunctionmodelMapper, FunctionmodelEntity> implements FunctionmodelService {

    @Autowired
    UserroleService userroleService;

    @Autowired
    RolefuncService rolefuncService;

    @Autowired
    LoginService loginService;

    @Override
    public List<FunctionmodelEntity> getFuncModeByUserID(Integer userid) {
        List<UserroleEntity> userRoleList = userroleService.list(new QueryWrapper<UserroleEntity>().eq("userId", userid));

        List<Integer> roleIds = userRoleList!=null&&userRoleList.size()>0 ? userRoleList.stream().map((userRole) -> {
            return userRole.getRoleid();
        }).collect(Collectors.toList()) : null;

        List<RolefuncEntity> role_fun_list = rolefuncService.list(new QueryWrapper<RolefuncEntity>().in("role_id", roleIds));

        List<Integer> funIds = role_fun_list!=null&&role_fun_list.size()>0 ? role_fun_list.stream().map(role_fun -> {
            return role_fun.getSysFuncId();
        }).collect(Collectors.toList()) : null;

        return this.baseMapper.selectBatchIds(funIds);
    }

    /**
     * 地图工具栏菜单
     * @param funcModes
     * @return
     */
    @Override
    public List<MapToolMenuVo> getMapToolMenu(List<FunctionmodelEntity> funcModes) {

        List<MapToolMenuVo> funcName = funcModes.stream().sorted((func1,func2) -> {
            return (func1.getMenusort() == null ? 0 : func1.getMenusort()) - (func2.getMenusort() == null ? 0 : func2.getMenusort());
        }).filter(funcMode ->
            funcMode.getParentid() == Constant.MAP_TOOL_MENU && funcMode.getDeleted() == 0
        ).map(funcMode -> {
            MapToolMenuVo menuVo = new MapToolMenuVo();
            menuVo.setText(funcMode.getDescr());
            menuVo.setIcon(funcMode.getIcon());
            menuVo.setCode(funcMode.getName());
            menuVo.setId(funcMode.getFuncid());
            HashMap<String, Object> map = new HashMap<>();
            map.put("funcName", funcMode.getName());
            menuVo.setAttributes(map);
            return menuVo;
        }).collect(Collectors.toList());

        return funcName;
    }

    /**
     * 系统顶部的主菜单
     */
    @Override
    public List<WebMenuVo> getWebMenu(List<FunctionmodelEntity> funcModes) {
        //查找数据库的主菜单的顶级菜单项记录，然后将功能权限作为子菜单加入到顶级菜单中，如果顶级菜单下没有权限，将忽略不显示
        //一级菜单
        List<FunctionmodelEntity> topFuncModes = this.baseMapper.selectList(new QueryWrapper<FunctionmodelEntity>().
                eq("parentId", Constant.FUNC_TYPE_WEB).
                eq("funcType", 1).
                eq("deleted", 0).
                orderByAsc("menuSort"));

        List<WebMenuVo> collect = topFuncModes.stream().map(topFuncMode -> {
            WebMenuVo menuVo = new WebMenuVo();
            menuVo.setText(topFuncMode.getDescr());
            menuVo.setIcon(topFuncMode.getIcon());
            menuVo.setId(topFuncMode.getFuncid());
            HashMap<String, Object> map = new HashMap<>();
            map.put("url", topFuncMode.getUrl());
            menuVo.setAttributes(map);
            List<WebMenuVo> childrenMenu = funcModes.stream().sorted((func1,func2) -> {
                return (func1.getMenusort() == null ? 0 : func1.getMenusort()) - (func2.getMenusort() == null ? 0 : func2.getMenusort());
            }).filter(func ->
                    topFuncMode.getFuncid().equals(func.getParentid()) && func.getDeleted() == 0
            ).map(func -> {
                WebMenuVo menuVo1 = new WebMenuVo();
                menuVo1.setText(func.getDescr());
                menuVo1.setIcon(func.getIcon());
                menuVo1.setId(func.getFuncid());
                HashMap<String, Object> stringObjectHashMap = new HashMap<>();
                stringObjectHashMap.put("url", func.getUrl());
                menuVo1.setAttributes(stringObjectHashMap);
                return menuVo1;
            }).filter(menuVo1 ->
                menuVo != null
            ).collect(Collectors.toList());

            menuVo.setMenu(childrenMenu);
            return menuVo;
        }).collect(Collectors.toList());

        return collect;
    }

    /**
     * 终端命令菜单
     * @param funcModes
     * @return
     */
    @Override
    public List<TerminalCommandMenuVo> getTerminalCommandMenu(List<FunctionmodelEntity> funcModes) {
        List<TerminalCommandMenuVo> terminalCommandMenuVo = funcModes.stream().filter(funcMode ->
                funcMode.getParentid() == Constant.TERMINAL_COMMAND_MENU && funcMode.getDeleted() == 0
        ).sorted((func1,func2) -> {
            return (func1.getMenusort() == null ? 0 : func1.getMenusort()) - (func2.getMenusort() == null ? 0 : func2.getMenusort());
        }).map(funcMode -> {
            TerminalCommandMenuVo menuVo = new TerminalCommandMenuVo();
            menuVo.setText(funcMode.getDescr());
            menuVo.setIcon(funcMode.getIcon());
            menuVo.setCode(funcMode.getName());
            menuVo.setId(funcMode.getFuncid());
            HashMap<String, Object> map = new HashMap<>();
            map.put("funcName", funcMode.getName());
            menuVo.setAttributes(map);

            setMenuVoAttr(menuVo, funcMode, funcModes);

            return menuVo;
        }).collect(Collectors.toList());
        return terminalCommandMenuVo;
    }

    /**
     * 根据用户权限，获取地图工具栏菜单\系统顶部的主菜单\终端命令菜单
     */
    @Override
    public R getAllMenu(HttpServletRequest request) {
        R loginInfo = loginService.getLoginInfo(request);

        List<MapToolMenuVo> mapToolMenu = (List<MapToolMenuVo>) loginInfo.get("mapToolMenu");
        List<WebMenuVo> webMenu = (List<WebMenuVo>) loginInfo.get("webMenu");
        List<TerminalCommandMenuVo> terminalCommandMenu = (List<TerminalCommandMenuVo>) loginInfo.get("terminalCommandMenu");

        return R.ok().put("mapToolMenu",mapToolMenu).put("terminalCommandMenu",terminalCommandMenu).put("webMenu",webMenu);
    }


    public void setMenuVoAttr(MenuVo menuVo, FunctionmodelEntity func, List<FunctionmodelEntity> funcModes){
        if (funcModes!=null && funcModes.size()>0) {
            funcModes.stream().filter(funcMode ->
                    funcMode.getFuncid() != Constant.TERMINAL_COMMAND_MENU && funcMode.getDeleted() == 0 && func.getParentid().equals(funcMode.getFuncid())
            ).sorted((func1,func2) -> {
                return (func1.getMenusort() == null ? 0 : func1.getMenusort()) - (func2.getMenusort() == null ? 0 : func2.getMenusort());
            }).map(funcMode -> {
                TerminalCommandMenuVo menuVo1 = new TerminalCommandMenuVo();
                menuVo1.setText(funcMode.getDescr());
                menuVo1.setIcon(funcMode.getIcon());
                menuVo1.setCode(funcMode.getName());
                menuVo1.setId(funcMode.getFuncid());
                HashMap<String, Object> map = new HashMap<>();
                map.put("funcName", funcMode.getName());
                menuVo1.setAttributes(map);

                menuVo.getAttributes().put("menu",menuVo1);

                setMenuVoAttr(menuVo1,funcMode,funcModes);

                return menuVo;
            });
        }
    }
}
