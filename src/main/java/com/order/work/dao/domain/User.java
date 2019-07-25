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
 * 用户表--记录用户一些真实信息(USER)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6805820803861276925L;
    
    /**  */
    private Long id;
    
    /** 用户关联账号id */
    private Long accountId;
    
    /** 用户真实名称 */
    private String userName;
    
    /** 创建时间 */
    private Date createTime;
    
    /** 创建人 */
    private String creator;
    
    /** 更新时间 */
    private Date updateTime;
    
    /** 更新人 */
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
     * 获取用户关联账号id
     * 
     * @return 用户关联账号id
     */
    public Long getAccountId() {
        return this.accountId;
    }
     
    /**
     * 设置用户关联账号id
     * 
     * @param accountId
     *          用户关联账号id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    
    /**
     * 获取用户真实名称
     * 
     * @return 用户真实名称
     */
    public String getUserName() {
        return this.userName;
    }
     
    /**
     * 设置用户真实名称
     * 
     * @param userName
     *          用户真实名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取更新人
     * 
     * @return 更新人
     */
    public String getUpdator() {
        return this.updator;
    }
     
    /**
     * 设置更新人
     * 
     * @param updator
     *          更新人
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }
}