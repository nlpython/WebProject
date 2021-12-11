package com.ys.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet的生命周期
 * 1. 初始化
 *      init()
 *      系统方法, 服务器自动调用, 只会执行一次.
 *      当第一次访问Servlet时触发.
 * 2. 就绪/调用
 *      service()
 *      系统方法, 服务器自动调用, 可以调用多次.
 *      当有请求访问servlet, service就会被调用
 * 3. 销毁
 *      destroy()
 *      当服务器关闭或出现异常时触发.
 */
@WebServlet("/ser03")
public class Servlet03 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init()...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service()...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()...");
    }
}
