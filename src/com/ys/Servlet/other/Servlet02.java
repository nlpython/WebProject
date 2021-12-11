package com.ys.Servlet.other;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *     request作用域 (只在一次请求中有效)
 *          设置作用域
 *              req.setAttribute("参数名", uname)
 *          获取作用域
 *              req.getAttribute("参数名")
 *          删除作用域
 *              req.removeAttribute("参数名")
 *
 */

@WebServlet("/t02")
public class Servlet02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet.t02....");

        // 请求的用户名和密码
        String uname = "Jill";
        String upwd = "12345";
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        req.setAttribute("name", uname);
        req.setAttribute("pwd", upwd);
        req.setAttribute("list", list);

        // 请求转发跳转到首页
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
