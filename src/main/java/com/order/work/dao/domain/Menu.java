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
 * (MENU)
 * 
 * @author bianj
 * @version 1.0.0 2019-07-24
 */
public class Menu implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1200054612545091691L;
    
    /**  */
    private Long id;
    
    /** 父级菜单ID */
    private Long parentId;
    
    /** 菜单名称 */
    private String menuName;
    
    /** 菜单描述 */
    private String desc;
    
    /** 状态 0：无效  1：有效 */
    private Integer status;
    
    /** 菜单类型  0  菜单   1  按钮 */
    private Integer type;
    
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
     * 获取父级菜单ID
     * 
     * @return 父级菜单ID
     */
    public Long getParentId() {
        return this.parentId;
    }
     
    /**
     * 设置父级菜单ID
     * 
     * @param parentId
     *          父级菜单ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    
    /**
     * 获取菜单名称
     * 
     * @return 菜单名称
     */
    public String getMenuName() {
        return this.menuName;
    }
     
    /**
     * 设置菜单名称
     * 
     * @param menuName
     *          菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    /**
     * 获取菜单描述
     * 
     * @return 菜单描述
     */
    public String getDesc() {
        return this.desc;
    }
     
    /**
     * 设置菜单描述
     * 
     * @param desc
     *          菜单描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    /**
     * 获取状态 0：无效  1：有效
     * 
     * @return 状态 0
     */
    public Integer getStatus() {
        return this.status;
    }
     
    /**
     * 设置状态 0：无效  1：有效
     * 
     * @param status
     *          状态 0：无效  1：有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * 获取菜单类型  0  菜单   1  按钮
     * 
     * @return 菜单类型  0  菜单   1  按钮
     */
    public Integer getType() {
        return this.type;
    }
     
    /**
     * 设置菜单类型  0  菜单   1  按钮
     * 
     * @param type
     *          菜单类型  0  菜单   1  按钮
     */
    public void setType(Integer type) {
        this.type = type;
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