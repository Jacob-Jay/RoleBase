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

import java.util.Date;

/**
 * 账号表--记录用于登录的账号的相关信息(ACCOUNT)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class Account implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3091939599080175747L;
    
    /**  */
    private Long id;
    
    /** 账号名称 */
    private String accountName;
    
    /** 账号密码 */
    private String password;
    
    /** 创建者 */
    private String creator;
    
    /** 创建时间 */
    private Date createTime;
    
    /** 更新者 */
    private String updator;
    
    /** 更新时间 */
    private Date updateTime;
    
    /** 状态  0：无效  1：有效 */
    private Integer status;
    
    /** 最后一次登录时间 */
    private Date lastLogin;
    
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
     * 获取账号名称
     * 
     * @return 账号名称
     */
    public String getAccountName() {
        return this.accountName;
    }
     
    /**
     * 设置账号名称
     * 
     * @param accountName
     *          账号名称
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    /**
     * 获取账号密码
     * 
     * @return 账号密码
     */
    public String getPassword() {
        return this.password;
    }
     
    /**
     * 设置账号密码
     * 
     * @param password
     *          账号密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取创建者
     * 
     * @return 创建者
     */
    public String getCreator() {
        return this.creator;
    }
     
    /**
     * 设置创建者
     * 
     * @param creator
     *          创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }
     
    /**
     * 设置创建时间
     * 
     * @param createTime
     *          创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * 获取更新者
     * 
     * @return 更新者
     */
    public String getUpdator() {
        return this.updator;
    }
     
    /**
     * 设置更新者
     * 
     * @param updator
     *          更新者
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    
    /**
     * 获取更新时间
     * 
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
     
    /**
     * 设置更新时间
     * 
     * @param updateTime
     *          更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * 获取状态  0：无效  1：有效
     * 
     * @return 状态  0
     */
    public Integer getStatus() {
        return this.status;
    }
     
    /**
     * 设置状态  0：无效  1：有效
     * 
     * @param status
     *          状态  0：无效  1：有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * 获取最后一次登录时间
     * 
     * @return 最后一次登录时间
     */
    public Date getLastLogin() {
        return this.lastLogin;
    }
     
    /**
     * 设置最后一次登录时间
     * 
     * @param lastLogin
     *          最后一次登录时间
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}