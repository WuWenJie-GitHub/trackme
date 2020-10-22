/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.trackme.common.constant;

/**
 *  页面常量
 *
 * @author Mark sunlightcs@gmail.com
 */
public class Constant {

    /**
     * 地图工具栏菜单权限 900200
     */
    public static final int MAP_TOOL_MENU = 900200;
    /**
     * 终端命令菜单权限 900700
     */
    public static final int TERMINAL_COMMAND_MENU = 900700;
    /**
     * 系统顶部的主菜单 -1
     */
    public static final int FUNC_TYPE_WEB = -1;
    /**
     * 超级管理员用户
     */
    public static final int USER_FLAG_SUPER_ADMIN = 2;
    /**
     * webgis用户
     */
    public static final int USER_FLAG_WEBGIS = 1;
    /**
     * 图片验证码
     * */
    public static final String IMAGECODE = "REDIS_IMAGE_CODE_";
	/**
     * 超级管理员ID
     * */
	public static final int SUPER_ADMIN = 1;
    /**
     * 当前页码
     */
    public static final String PAGE = "page";
    /**
     * 每页显示记录数
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     *  升序
     */
    public static final String ASC = "asc";
	/**
	 * 菜单类型
	 * 
	 * @author chenshun
	 * @email sunlightcs@gmail.com
	 * @date 2016年11月15日 下午1:24:29
	 */
    public enum MenuType {
        /**
         * 目录
         */
    	CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    
    /**
     * 定时任务状态
     * 
     * @author chenshun
     * @email sunlightcs@gmail.com
     * @date 2016年12月3日 上午12:07:22
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
    	NORMAL(0),
        /**
         * 暂停
         */
    	PAUSE(1);

        private int value;

        ScheduleStatus(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }



    /**
     * 云服务商
     */
    public enum CloudService {
        /**
         * 七牛云
         */
        QINIU(1),
        /**
         * 阿里云
         */
        ALIYUN(2),
        /**
         * 腾讯云
         */
        QCLOUD(3);

        private int value;

        CloudService(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 地图电子围栏
     * */
    public enum MapEnclosure {

        /**
         * 多边形电子围栏
         */
         POLYGON("polygon"),
        /**
         * 矩形电子围栏
         */
         RECT("rect"),
        /**
         * 圆形电子围栏
         */
         CIRCLE("circle"),
        /**
         * 路线
         */
         ROUTE("route"),
        /**
         * 地图标注
         */
         MARKER("marker");

        private String value;

        MapEnclosure(String value) {
            this.value = value;
        }
        public String getValue() {return value;}
    }
}
