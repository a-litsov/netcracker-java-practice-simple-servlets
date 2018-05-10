package com.netcracker.adlitsov;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFirstServlet extends HttpServlet {

    private static final String correctPass = "123456";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (correctPass.equals(password)) {
            resp.getWriter().append("Hello ").append(login).append(", you entered correct password.");
        } else {
            resp.sendError(403);
        }


    }
}
