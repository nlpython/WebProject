package com.ys.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Session对象
 *      Session表示一次会话, 会话中可以有多个请求
 *      获取Session对象 或 创建Session对象
 *      req.getSession()
 *      当Session对象存在时, 表示获取Session对象, 当Session对象不存在时
 *  特点:
 *      1. 服务器存储共享数据的技术
 *      2. session需要依赖cookie技术
 *      3. 每个用户对应一个独立的session
 *      4. 每个session对象的有效时长是30分钟
 *  使用:
 *
 */

@WebServlet("/se01")
public class Session01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置响应格式
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("gbk");

        System.out.println("Learn Session...");
        resp.getWriter().write("<h1>Learn Session...</h1>");

        // 创建或获取Session
        HttpSession session = req.getSession();

        // 设置session的有效时长(s)
        session.setMaxInactiveInterval(5);

        // 令session强制失效
        // session.invalidate();

        // 获取会话表示符(JSESSIONID)
        System.out.println("会话标识符: " + session.getId());
        // 是否是新的会话
        System.out.println("是否是新的会话: " + session.isNew());
        // 会话开始时间
        System.out.println("会话开始时间 " + session.getCreationTime());
        // 最后一次访问时间
        System.out.println("最后一次访问时间: " + session.getLastAccessedTime());
    }
}
