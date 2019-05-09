package com.imooc.icanvas.controller;


import com.imooc.icanvas.biz.AccountBiz;
import com.imooc.icanvas.biz.impl.AccountBizImpl;
import com.imooc.icanvas.entity.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DefaultController {
    private AccountBiz accountBiz = new AccountBizImpl();
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
}
