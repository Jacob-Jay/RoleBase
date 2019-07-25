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
 * 角色表--记录角色的相关信息(ROLE)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class Role implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2414776243379025187L;
    
    /**  */
    private Integer id;
    
    /** 角色标识符 */
    private String role;
    
    /** 角色描述 */
    private String desc;
    
    /** 状态  0：无效  1：有效 */
    private Integer status;
    
    /**  */
    private String creator;
    
    /**  */
    private Date createTime;
    
    /**  */
    private String updator;
    
    /**  */
    private Date updateTime;
    
    /**
     * 获取
     * 
     * @return 
     */
    public Integer getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 获取角色标识符
     * 
     * @return 角色标识符
     */
    public String getRole() {
        return this.role;
    }
     
    /**
     * 设置角色标识符
     * 
     * @param role
     *          角色标识符
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * 获取角色描述
     * 
     * @return 角色描述
     */
    public String getDesc() {
        return this.desc;
    }
     
    /**
     * 设置角色描述
     * 
     * @param desc
     *          角色描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
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
     * 获取
     * 
     * @return 
     */
    public String getCreator() {
        return this.creator;
    }
     
    /**
     * 设置
     * 
     * @param creator
     *          
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Date getCreateTime() {
        return this.createTime;
    }
     
    /**
     * 设置
     * 
     * @param createTime
     *          
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public String getUpdator() {
        return this.updator;
    }
     
    /**
     * 设置
     * 
     * @param updator
     *          
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    
    /**
     * 获取
     * 
     * @return 
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
     
    /**
     * 设置
     * 
     * @param updateTime
     *          
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}