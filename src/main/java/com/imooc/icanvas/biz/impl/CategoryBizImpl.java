package com.imooc.icanvas.biz.impl;

import com.imooc.icanvas.biz.CategoryBiz;
import com.imooc.icanvas.dao.CategoryDao;
import com.imooc.icanvas.entity.Category;
import com.imooc.icanvas.global.DaoFactory;

import java.util.List;

public class CategoryBizImpl implements CategoryBiz {
    private CategoryDao categoryDao = DaoFactory.getInstence().getDao(CategoryDao.class);

    public List<Category> getAll() {
       return categoryDao.selectAll();
    }

    public void add(Category category) {
            categoryDao.insert(category);
    }

    public void remove(int id) {
        categoryDao.delete(id);
    }

    public Category get(int id) {
        return categoryDao.select(id);
    }

    public void edit(Category category) {
        categoryDao.update(category);
    }
}
