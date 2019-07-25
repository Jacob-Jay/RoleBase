package com.order.enums;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 17:08
 *
 * 状态枚举
 */
public enum StatusEnum {

    DISABLE("禁用",0),ENABLE("启用",1);

    private String desc;
    private Integer code;

    StatusEnum(String desc, Integer code) {
        this.desc = desc;
        this.code = code;
    }

    public  String getDesc() {
       return desc;
    }

    public Integer getCode() {
        return code;
    }

}
