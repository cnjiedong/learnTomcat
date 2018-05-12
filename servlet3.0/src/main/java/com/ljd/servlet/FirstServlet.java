package com.ljd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

    final static Logger LOG = LoggerFactory.getLogger(FirstServlet.class);

    private static final long serialVersionUID = 6833688147345340845L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("hello");
        PrintWriter out = response.getWriter();
        out.print("first servlet");
        out.flush();
        out.close();

    }


}