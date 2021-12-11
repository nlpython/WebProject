package com.ys.Servlet.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * response: 表示服务端返回数据的响应数据
 * 响应头:
 * 响应行:
 * 响应体:
 */

@WebServlet("/ser06")
public class Response01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is GET.");

        // 设置响应头, 按照key-value键值对的形式
        resp.setHeader("hehe", "haha");
        resp.addHeader("hubei", "wuhan");

        // 设置响应状态码
//        resp.sendError(404, "not found");

        resp.getWriter().write("<b>java is easy</b>");  // <b>加粗
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is POST.");
        this.doGet(req, resp);
    }
}
