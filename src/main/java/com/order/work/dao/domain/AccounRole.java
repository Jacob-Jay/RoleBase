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
 * (ACCOUN_ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-22
 */
public class AccounRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1998337424906643655L;
    
    /**  */
    private Long id;
    
    /** 账号id */
    private Long accountId;
    
    /** 角色ID */
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
     * 获取账号id
     * 
     * @return 账号id
     */
    public Long getAccountId() {
        return this.accountId;
    }
     
    /**
     * 设置账号id
     * 
     * @param accountId
     *          账号id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    
    /**
     * 获取角色ID
     * 
     * @return 角色ID
     */
    public Long getRoleId() {
        return this.roleId;
    }
     
    /**
     * 设置角色ID
     * 
     * @param roleId
     *          角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}