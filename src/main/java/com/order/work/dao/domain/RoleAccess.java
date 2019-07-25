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
 * 角色  权限表(ROLE_ACCESS)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-22
 */
public class RoleAccess implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8434474297557105595L;
    
    /**  */
    private Long id;
    
    /**  */
    private Long roleId;
    
    /**  */
    private Long accessId;
    
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
     * 获取
     * 
     * @return 
     */
    public Long getRoleId() {
        return this.roleId;
    }
     
    /**
     * 设置
     * 
     * @param roleId
     *          
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Long getAccessId() {
        return this.accessId;
    }
     
    /**
     * 设置
     * 
     * @param accessId
     *          
     */
    public void setAccessId(Long accessId) {
        this.accessId = accessId;
    }
}