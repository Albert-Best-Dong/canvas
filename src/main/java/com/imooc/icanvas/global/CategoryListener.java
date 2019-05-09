package com.imooc.icanvas.global;

import com.imooc.icanvas.biz.CategoryBiz;
import com.imooc.icanvas.biz.impl.CategoryBizImpl;
import com.imooc.icanvas.entity.Category;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public class CategoryListener implements ServletContextListener {
    private CategoryBiz categoryBiz = new CategoryBizImpl();
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        List<Category> categoryList = categoryBiz.getAll();
        servletContextEvent.getServletContext().setAttribute("categoryList",categoryList);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
