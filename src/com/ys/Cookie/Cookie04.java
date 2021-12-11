package com.ys.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie04 的路径
 *   Cookie的setPath()设置cookie的路径, 这个路径直接决定服务器的请求是否会从浏览器加载某些cookie
 *
 *   当前项目  站点名为: /WebProject_war_exploded
 *   当前服务器域名为: localhost:8080
 *
 *   1. 当前服务器下, 任何项目的任意资源, 都可以获取cookie对象
 *          setPath("/");
 *   2. 在当前项目下可以获取cookie对象(默认)
 *          setPath("/WebProject_war_exploded");
 *   3. 在指定项目下, 可以获取cookie对象 (指定项目站点名: /***)
 *          setPath("/***");
 *   4. 在指定项目的指定资源下, 以获取cookie对象
 *          setPath("/WebProject_war_exploded/cook02");
 */

@WebServlet("/cook04")
public class Cookie04 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("name", "pwd");
        cookie.setPath("/WebProject_war_exploded");
        resp.addCookie(cookie);
    }
}
