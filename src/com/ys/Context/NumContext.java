package com.ys.Context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/con03")
public class NumContext extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8"); // 防止中文乱码

        ServletContext context = this.getServletContext();
        Integer num = (Integer) context.getAttribute("num");
        if (num == null) {
            context.setAttribute("num", 1);
        } else {
            num++;
            // 将num设置为ServletContext中
            context.setAttribute("num", num);
        }

        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<h1>用户第" + context.getAttribute("num") + "次访问此网页.</h1>");
        out.write("</body>");
        out.write("</html>");
    }
}
