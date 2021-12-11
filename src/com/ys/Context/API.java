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
 *          1. 获取web.xml中配置的公共属性 context.getInitParameter(String key)
 *          <context-param>
 *              <param-name>beijing</param-name>
 *              <param-value>beautiful</param-value>
 *          </context-param>
 *          (如果有多组, 可写多个context-param)
 *
 *          2. 获取路径
 *
 */

@WebServlet("/con02")
public class API extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取ServletContext对象
        ServletContext context = this.getServletContext();


        // 获取web.xml配置中的公共属性
        System.out.println(context.getInitParameter("beijing"));
        // 获取某个文件的绝对路径
        String path = context.getRealPath("web.xml"); //getContextPath()是获取web项目的上下文路径
        System.out.println(path);

    }
}
