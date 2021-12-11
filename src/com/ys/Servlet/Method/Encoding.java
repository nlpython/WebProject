package com.ys.Servlet.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 乱码问题
 *    1. get请求
 *          1. 获取字符串之后使用new String(name.getBytes("iso-8859-1"), "utf-8")
 *          2. 在设置request的编码格式, 同时在servlet.xml添加useBodyEncodingForURI=true
 *    2. post请求
 *          1. request.setCharacterEncoding("utf-8");
 */


@WebServlet("/ser07")
public class Encoding extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
        String name = req.getParameter("name");
        // 设置编码格式
//        req.setCharacterEncoding("utf-8");
        System.out.println(new String(name.getBytes("iso-8859-1"), "utf-8"));
        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        System.out.println(name);
        resp.setCharacterEncoding("gbk");  // 与网页编码格式保持一致
        resp.getWriter().write("欢迎你");
    }
}
