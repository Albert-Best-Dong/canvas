package com.imooc.icanvas.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.icanvas.biz.AccountBiz;
import com.imooc.icanvas.biz.CanvasBiz;
import com.imooc.icanvas.biz.CategoryBiz;
import com.imooc.icanvas.biz.impl.AccountBizImpl;
import com.imooc.icanvas.biz.impl.CanvasBizImpl;
import com.imooc.icanvas.biz.impl.CategoryBizImpl;
import com.imooc.icanvas.entity.Account;
import com.imooc.icanvas.entity.Canvas;
import com.imooc.icanvas.entity.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DefaultController {
    private AccountBiz accountBiz = new AccountBizImpl();
    private CanvasBiz canvasBiz = new CanvasBizImpl();
    private CategoryBiz categoryBiz = new CategoryBizImpl();
    public void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/admin/login.jsp").forward(request,response);
    }
    //  /login.do
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        Account account = accountBiz.login(name,password);
        if(name==null)
            response.sendRedirect("toLogin.do");
        else{
            request.getSession().setAttribute("ACCOUNT",account);
            response.sendRedirect("/admin/Canvas/list.do");
        }
    }

    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Canvas> list = null;

        String pageNum = request.getParameter("pageNum");
        if(pageNum==null) pageNum="1";
        PageHelper.startPage(Integer.parseInt(pageNum),3);

        String categoryId = request.getParameter("cid");

        if(categoryId == null){
            list = canvasBiz.getAll();
            PageInfo pageInfo = PageInfo.of(list);
            request.setAttribute("pageInfo",pageInfo);
        }else{
            int cid = Integer.parseInt(categoryId);


            list = canvasBiz.getForCategory(cid);
            PageInfo pageInfo = PageInfo.of(list);

            request.setAttribute("pageInfo",pageInfo);
            request.setAttribute("cid",cid);

        }

        request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request,response);
    }

    //  /detail.do
    public void detail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Canvas canvas = canvasBiz.get(id);
        request.setAttribute("canvas",canvas);
        request.getRequestDispatcher("/WEB-INF/pages/detail.jsp").forward(request,response);
    }
}
