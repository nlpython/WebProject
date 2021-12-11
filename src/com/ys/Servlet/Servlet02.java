package com.ys.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet类中可以有service()方法
 *      用来接受GET或POST请求
 *      如果service 和 doGet 或者 doPost 同时存在, 那么默认调用service方法
 *      如果重写的service()方法中调用父类super.service()会根据请求的方式跳转到doGet或者doPost
 * doGet方法:
 *      用来接受doGet请求
 * doPost方法:
 *      用来接受doPost请求
 *
 * 总结:
 *       在编写Servlet类的时候, 不需要重写service()方法, 只需要重写doGet和doPost方法即可
 */

@WebServlet("/ser02")
public class Servlet02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is doGet request.");
        resp.getWriter().write("hello, first web project");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is doPost request.");
        resp.getWriter().write("hello, first web project");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello Request01");

        // 响应数据
        resp.getWriter().write("hello, first web project");
    }

}
