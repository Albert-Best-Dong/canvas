package com.imooc.icanvas.entity;

import java.util.Date;

/**
 * 分类实体
 *
 * @author albert
 * @date 2019/5/7
 */
public class Category {
    private int id;
    private String name;            //名称
    private String createName;      //创建名称
    private Date createTime;        //创建时间
    private Date updateTime;        //最后修改你时间
    private String description;     //描述

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category() {
    }

    public Category(int id, String name, Date updateTime, String description) {
        this.id = id;
        this.name = name;
        this.updateTime = updateTime;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
