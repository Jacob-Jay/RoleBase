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

import java.sql.Timestamp;

/**
 * (REMEMBER_ME)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class RememberMe implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5349476640426566530L;
    
    /**  */
    private String accountName;
    
    /**  */
    private String id;
    
    /**  */
    private String token;
    
    /**  */
    private Timestamp lastUsed;
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getAccountName() {
        return this.accountName;
    }
     
    /**
     * 设置
     * 
     * @param accountName
     *          
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getToken() {
        return this.token;
    }
     
    /**
     * 设置
     * 
     * @param token
     *          
     */
    public void setToken(String token) {
        this.token = token;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Timestamp getLastUsed() {
        return this.lastUsed;
    }
     
    /**
     * 设置
     * 
     * @param lastUsed
     *          
     */
    public void setLastUsed(Timestamp lastUsed) {
        this.lastUsed = lastUsed;
    }
}