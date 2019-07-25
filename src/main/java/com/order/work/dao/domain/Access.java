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
 * 权限控制表(ACCESS)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class Access implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1301482729672636551L;
    
    /**  */
    private Long id;
    
    /** 所属菜单id */
    private Long menuId;
    
    /** 访问路径 */
    private String url;
    
    /** 访问方法  get  post。。 */
    private String method;
    
    /** 描述 */
    private String desc;
    
    /** 状态  0无效  1有效 */
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
     * 获取所属菜单id
     * 
     * @return 所属菜单id
     */
    public Long getMenuId() {
        return this.menuId;
    }
     
    /**
     * 设置所属菜单id
     * 
     * @param menuId
     *          所属菜单id
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    
    /**
     * 获取访问路径
     * 
     * @return 访问路径
     */
    public String getUrl() {
        return this.url;
    }
     
    /**
     * 设置访问路径
     * 
     * @param url
     *          访问路径
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * 获取访问方法  get  post。。
     * 
     * @return 访问方法  get  post
     */
    public String getMethod() {
        return this.method;
    }
     
    /**
     * 设置访问方法  get  post。。
     * 
     * @param method
     *          访问方法  get  post。。
     */
    public void setMethod(String method) {
        this.method = method;
    }
    
    /**
     * 获取描述
     * 
     * @return 描述
     */
    public String getDesc() {
        return this.desc;
    }
     
    /**
     * 设置描述
     * 
     * @param desc
     *          描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    /**
     * 获取状态  0无效  1有效
     * 
     * @return 状态  0无效  1有效
     */
    public Integer getStatus() {
        return this.status;
    }
     
    /**
     * 设置状态  0无效  1有效
     * 
     * @param status
     *          状态  0无效  1有效
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