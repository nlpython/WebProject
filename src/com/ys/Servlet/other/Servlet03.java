package com.ys.Servlet.other;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *   响应数据
 *      字符输出流
 *          getWriter() 向客户输出字符
 *      字节输出流
 *          getOutputStream() 向客户端输出任意内容
 *   乱码解决方案
 *      1. 设置客户端与服务端的编码格式一致
 *
 *          同时设置两端的编码
 *              resp.setContentType("text/html;charset=UTF-8");
 *      2. 设置客户端与服务端的编码格式都支持中文
 */

@WebServlet("/t03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应类型
        resp.setHeader("Content-Type", "text/html");

        // 字符流
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello 01</h1>");
        writer.close();

        // 字节流
//        ServletOutputStream out = resp.getOutputStream();
//        out.write("Hello 02".getBytes());
//        out.close();
    }
}
