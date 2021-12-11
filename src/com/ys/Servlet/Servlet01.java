package com.ys.Servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet的实现
 * 1. 新建包
 * 2. 继承HttpServlet类 (实现Servlet)规范
 * 3. 重写HttpServlet类中的service()方法(该方法在Servlet类被访问时,自动调用. 作用: 接受请求,响应结果
 * 4. 在Servlet上添加注解@WebServlet, 设置Servlet类的访问路径 (资源的对外访问路径, 浏览器通过
 *    访问该路径, 从而访问Servlet类
 *
 * 注:
 *      1. service方法是由服务器自动调用
 *      2. 设置Servlet类的访问路径时, 需要添加"/"
 *      3. 在同一个项目下, Servlet类的对外访问路径唯一 (不能重复)
 *      4. 访问Servlet时, 路径格式如下:
 *          http://localhost:端口/项目路径/资源路径?参数名=参数值
 *
 *          项目路径: 站点名, 项目对外访问路径, 在Tomcat中设置
 *          资源路径: 通过@WebServlet设置
 */
@WebServlet("/ser01")  // 资源路径
public class Servlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello Request01");

        // 相应数据
        resp.getWriter().write("hello, first web project");
    }

}
