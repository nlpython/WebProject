package com.ys.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  Cookie的到期时间
 *      设置Cookie对象的失效时间
 *
 *      maxAge
 *      正整数:
 *          表示cookie会存在指定秒数
 *      负整数: (默认-1)
 *          表示浏览器关闭失效
 *      零:
 *          表示即刻删除
 *
 *  注意:
 *      1. cookie只存活在当前浏览器中, 不夸浏览器, 不跨电脑.
 *      2. cookie不能设置中文, 如有需要, 使用URLEncoder.encode()方法进行编码.
 *      3. cookie在浏览器中有存储上限
 *      4. cookie如果在同域名(domain)和路径(path)下, 出现相同的name属性, 则会覆盖
 */

@WebServlet("/cook03")
public class Cookie03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取cookie对象
        Cookie cookie = new Cookie("uname02", "admin02");
        // 设置失效时间
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);

        // 获取cookie对象
        Cookie cookie1 = new Cookie("uname03", "admin03");
        // 设置失效时间
        cookie1.setMaxAge(20);
        resp.addCookie(cookie1);

        // 获取cookie对象
        Cookie cookie2 = new Cookie("uname04", "admin04");
        // 设置失效时间
        cookie2.setMaxAge(0);
        resp.addCookie(cookie2);


        // 如果cookie存在, 删除cookie
        Cookie cook = new Cookie("uname", null); // 覆盖
        cook.setMaxAge(0);
        resp.addCookie(cook);

    }
}
