package com.ys.Config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * ServletConfig:
 *     作用:
 *          方便每一个servlet获取自己单独的属性配置
 *     特点:
 *          1. 每一个servlet单独拥有一个ServletConfig对象
 *     使用:
 *
 */

@WebServlet("/conf01")
public class Config01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取ServletConfig对象
        ServletConfig config = this.getServletConfig();
        String value = config.getInitParameter("China");
        System.out.println(value);

        // 获取所有的key
        Enumeration<String> initParameterNames = config.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            System.out.println((String) initParameterNames.nextElement());
        }
    }
}
