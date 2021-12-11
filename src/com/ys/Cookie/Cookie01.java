package com.ys.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  Cookie的创建与发送
 */

@WebServlet("/cook01")
public class Cookie01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到cookie对象
        Cookie cookie = new Cookie("uname", "admin");

        // 响应cookie
        resp.addCookie(cookie);
    }
}
