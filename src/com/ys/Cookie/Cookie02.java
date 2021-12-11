package com.ys.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie是浏览器技术, 与服务器是否关闭无关
 * Cookie的获取
 *      获取所有的Cookie对象, 返回Cookie数组
 *          Cookie04[] cookies = req.getCookies();
 */

@WebServlet("/cook02")
public class Cookie02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取所有的Cookie对象, 返回Cookie数组
        Cookie[] cookies = req.getCookies();

        // 判断Cookie是否存在, 遍历获取值
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("名称: " + cookie.getName() + ", 值: " + cookie.getValue());
                // 获取指定的cookie对象
                if ("uname".equals(cookie.getName())) {
                    System.out.println("指定值为: " + cookie.getValue());
                }
            }
        }
    }
}
