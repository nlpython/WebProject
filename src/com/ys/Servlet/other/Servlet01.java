package com.ys.Servlet.other;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *   请求转发
 *      服务端的一种跳转方式
 *      格式:
 *          req.getRequestDispatcher("路径").forward(req, resp)
 *
 *      只能跳转到当前项目资源
 *
 */

@WebServlet("/t01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet.t01....");

        // 请求的用户名和密码
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");

        System.out.println("姓名: " + name + ", 密码: " + pwd);

        // 请求转发跳转到首页
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
