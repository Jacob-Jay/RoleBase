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
 * 用户信息(USER_INFO)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-22
 */
public class UserInfo implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5846590226728185453L;
    
    /**  */
    private Long id;
    
    /** 昵称 */
    private String userName;
    
    /** 邮箱 */
    private String email;
    
    /** 账号ID */
    private Long accountId;
    
    /** 创建人 */
    private String creator;
    
    /** 创建时间 */
    private Date createTime;
    
    /** 更新时间 */
    private Date updateTime;
    
    /** 更新者 */
    private String updator;
    
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
     * 获取昵称
     * 
     * @return 昵称
     */
    public String getUserName() {
        return this.userName;
    }
     
    /**
     * 设置昵称
     * 
     * @param userName
     *          昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * 获取邮箱
     * 
     * @return 邮箱
     */
    public String getEmail() {
        return this.email;
    }
     
    /**
     * 设置邮箱
     * 
     * @param email
     *          邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获取账号ID
     * 
     * @return 账号ID
     */
    public Long getAccountId() {
        return this.accountId;
    }
     
    /**
     * 设置账号ID
     * 
     * @param accountId
     *          账号ID
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    
    /**
     * 获取创建人
     * 
     * @return 创建人
     */
    public String getCreator() {
        return this.creator;
    }
     
    /**
     * 设置创建人
     * 
     * @param creator
     *          创建人
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
}