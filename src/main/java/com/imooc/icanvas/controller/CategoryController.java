package com.imooc.icanvas.controller;

import com.imooc.icanvas.biz.CategoryBiz;
import com.imooc.icanvas.biz.impl.CategoryBizImpl;
import com.imooc.icanvas.entity.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class CategoryController {
    private CategoryBiz categoryBiz = new CategoryBizImpl();
    // /admin/Category/list.do
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> list = categoryBiz.getAll();
        System.out.println(list);
        request.setAttribute("categoryList", list);
        request.getRequestDispatcher("/WEB-INF/pages/admin/category_list.jsp").forward(request, response);
    }
    // /admin/Category/toAdd.do
    public void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Category> list = categoryBiz.getAll();
//        request.setAttribute("categoryList", list);
        request.getRequestDispatcher("/WEB-INF/pages/admin/add_category.jsp").forward(request, response);
    }
    // /admin/Category/add.do
    public void add(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String name = request.getParameter("name");
        String createName = request.getParameter("createname");
        Date createTime = new Date();
        Date updateTime = new Date();
        String description = request.getParameter("description");
        Category category = new Category();
        category.setName(name);
        category.setCreateName(createName);
        category.setCreateTime(createTime);
        category.setUpdateTime(updateTime);
        category.setDescription(description);
        System.out.println(category);
        categoryBiz.add(category);

        response.sendRedirect("list.do");
    }

    public void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Category category = categoryBiz.get(Integer.parseInt(id));
        request.setAttribute("editCategory",category);
        request.getRequestDispatcher("/WEB-INF/pages/admin/update_category.jsp").forward(request,response);
    }

    public void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Date updateTime = new Date();
        Category category = new Category(Integer.parseInt(id),name,updateTime,description);
        categoryBiz.edit(category);
        response.sendRedirect("list.do");
    }
    // /admin/Category/add.do
    public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");

        categoryBiz.remove(Integer.parseInt(id));

        response.sendRedirect("list.do");
    }
}
