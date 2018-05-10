package com.netcracker.adlitsov;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class MySecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date = new Date();
        String userAgent = req.getHeader("User-Agent");

        resp.getWriter().append("<html><body>")
                        .append("Current date/time: ").append(date.toString())
                        .append("<br />User-agent: ").append(userAgent)
                        .append("</body></html>");

    }
}
