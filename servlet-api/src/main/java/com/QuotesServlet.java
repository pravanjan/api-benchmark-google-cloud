package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QuotesServlet extends HttpServlet  {

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String responseString = new HttpRequest().getcall("http://34.69.21.68/query/hello");
            PrintWriter out = resp.getWriter();
            out.println(responseString);
        }
    }