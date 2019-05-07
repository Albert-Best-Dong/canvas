package com.imooc.icanvas.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DefaultController {
    public void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/admin/login.jsp").forward(request,response);
    }
    //  /login.do
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("account");
        String password = request.getParameter("password");
//        Account account = accountBiz.login(name,password);
        if(name==null)
            response.sendRedirect("toLogin.do");
        else{
//            request.getSession().setAttribute("ACCOUNT",account);
            response.sendRedirect("/admin/Cake/list.do");
        }
    }
}
