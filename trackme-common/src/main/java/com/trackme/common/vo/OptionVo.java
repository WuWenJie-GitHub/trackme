package com.trackme.common.vo;

import lombok.Data;

/**
 * @description 下拉框
 * @author: wuwenjie
 * @data: 2020/10/21 9:55
 */
@Data
public class OptionVo {
    /*
     <el-form-item label="角色:">
        <el-select v-model="role" placeholder="请选择">
          <el-option
            v-for="item in roleOptions"
            :key="item.value"
            :label="item.label"
            :value="item.value"
          >
          </el-option>
        </el-select>
      </el-form-item>
    */

    private String value;
    private String label;
}
