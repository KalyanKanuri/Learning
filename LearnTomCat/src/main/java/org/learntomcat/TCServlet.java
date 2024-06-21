package org.learntomcat;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TCServlet extends HttpServlet {
    public void service(HttpServletRequest  req, HttpServletResponse res) {
        System.out.println("TCServlet");
    };
}
