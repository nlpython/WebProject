package com.ys.Servlet.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 获取请求
 *      常用请求方法
 *      获取请求参数
 */

@WebServlet("/ser04")
public class Request01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURL().toString();
        System.out.println("获取客户端请求的完整URL: " + url);

        // 获取客户端请求的部分URL (从站点名开始, 到?结束)
        String uri = req.getRequestURI().toString();
        System.out.println("获取客户端请求的部分URI: " + uri);

        // 获取请求行中的参数部分
        String queryString = req.getQueryString();
        System.out.println("获取请求行中的参数部分: " + queryString);

        // 获取客户端的请求方式
        String method = req.getMethod();
        System.out.println("获取客户端的请求方式: " + method);

        // 获取Http版本号
        String protocol = req.getProtocol();
        System.out.println("获取Http版本号: " + protocol);

        // 获取webapp名字 (站点名)
        String webapp = req.getContextPath();
        System.out.println("获取webapp的名字: " + webapp);

        /**
         * 获取请求参数
         *      1. 通过参数名获取参数值, 返回字符串
         *           request.getParameter("参数名");
         *             参数名:
         *                  1. 表单元素的name属性值
         *                  2. ajax的data属性的值的键
         *                  3. 超链接参数的键
         *      2. 通过参数名获取所有的参数值, 返回数组
         *
         */

        // 获取用户名
        String uname= req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        System.out.println("姓名: " + uname + ", 密码: " + upwd);

        // 通过参数名获取所有的参数值, 返回数组
//        String[] hobbys = req.getParameterValues("hobby");
//        System.out.println(hobbys.length);


    }
}
