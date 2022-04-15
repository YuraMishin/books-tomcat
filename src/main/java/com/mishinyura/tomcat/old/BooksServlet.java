package com.mishinyura.tomcat.old;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class BooksServlet.
 * Implements BooksServlet.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 15.04.2022
 */
@WebServlet("/books")
public class BooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try (PrintWriter writer = resp.getWriter()) {
            writer.write("Hello World!");
        }
    }
}
