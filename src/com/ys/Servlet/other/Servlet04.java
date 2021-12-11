package com.ys.Servlet.other;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  重定向
 *      服务端指导, 客户端行为的跳转方式
 *
 *      特点:
 *          1. 地址栏会发生改变
 *          2. 客户端跳转
 *          3. 有两次跳转
 *          4. request对象不共享
 *          5. 可跳转到任意资源
 *
 */

@WebServlet("/t04")
public class Servlet04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("t04....");

        // 重定向跳转到页面
//        resp.sendRedirect("login.html");
        resp.sendRedirect("http://www.baidu.com");
    }
}
