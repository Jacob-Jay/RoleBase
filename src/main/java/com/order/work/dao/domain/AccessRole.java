package com.order.work.dao.domain;/*
 * Welcome to use the TableToBean Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:3.6.0
 */

/**
 * 角色控制 --角色  中间表(ACCESS_ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class AccessRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8614951714709433738L;
    
    /**  */
    private Long id;
    
    /** 角色控制id */
    private Long accessId;
    
    /** 角色id */
    private Long roleId;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 获取角色控制id
     * 
     * @return 角色控制id
     */
    public Long getAccessId() {
        return this.accessId;
    }
     
    /**
     * 设置角色控制id
     * 
     * @param accessId
     *          角色控制id
     */
    public void setAccessId(Long accessId) {
        this.accessId = accessId;
    }
    
    /**
     * 获取角色id
     * 
     * @return 角色id
     */
    public Long getRoleId() {
        return this.roleId;
    }
     
    /**
     * 设置角色id
     * 
     * @param roleId
     *          角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}