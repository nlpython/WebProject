package com.ys.Servlet.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/ser05")
public class Request02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取用户请求数据
        // 无论请求方式是post还是get, 获取用户数据的方式不变
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String fav = req.getParameter("fav");
        System.out.println(name + ": " + pwd + ": " + fav);

        // 获取用户数据中所有key
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        // 获取相同key的多个数据值, 例如checkbox
        String[] parameterValues = req.getParameterValues("fav");
        System.out.println(Arrays.toString(parameterValues));


        // 获取远程客户端的地址
        String remoteAddress = req.getRemoteAddr();
        // 获取远程客户端的主机名称
        String remoteHost = req.getRemoteHost();
        // 获取远程客户端的端口号
        int remotePort = req.getRemotePort();
        System.out.println(remoteAddress + ": " + remoteHost + ": " + remotePort);

        String localAddr = req.getLocalAddr();
        String localName = req.getLocalName();
        System.out.println(localAddr + ": " + localName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("POST");
    }
}
