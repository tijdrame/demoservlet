package com.emard;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    // on peut aussi utilisé service au lieu de doGet
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In service");
        response.setContentType("text/html");
        var out = response.getWriter();
        out.println("<h2><b>Hello world!</b></h2>");
    }

}
