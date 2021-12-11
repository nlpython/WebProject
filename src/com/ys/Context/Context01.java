package com.ys.Context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ServletContext:
 *     作用:
 *          解决不同用户的数据共享问题
 *     特点:
 *          1. 由服务器创建
 *          2. 所有用户共享一个ServletContext对象
 *          3. 所有的Servlet都可以访问到同一个ServletContext对象
 *          4. 每一个Web项目对应的是同一个ServletContext
 *     用法:
 *          1. 获取ServletContext对象
 *          2. 设置属性值
 *          3. 获取属性值
 *
 */

@WebServlet("/con01")
public class Context01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取ServletContext对象
        ServletContext context = this.getServletContext();
        // context = this.getServletConfig().getServletContext();
        // context = req.getSession().getServletContext();

        // 2. 设置属性值
        context.setAttribute("key", "value");
        // 3. 获取属性值
        String value = (String) context.getAttribute("key");
        System.out.println(value);

        System.out.println(context.getInitParameter("beijing"));
    }
}
