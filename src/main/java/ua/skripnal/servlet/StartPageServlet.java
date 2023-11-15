package ua.skripnal.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StartPageServlet extends HttpServlet {

    private static String startPage = "/index.jsp";

    @Override
    public void init() throws ServletException {
        System.out.println("init servlet: " + StartPageServlet.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service servlet: " + StartPageServlet.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(startPage).forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy servlet: " + StartPageServlet.class);
    }
}
