package com.imooc.icanvas.biz;

import com.imooc.icanvas.entity.Category;

import java.util.List;

public interface CategoryBiz {
    List<Category> getAll();

    void add(Category category);

    void remove(int id);

    Category get(int id);

    void edit(Category category);

}

