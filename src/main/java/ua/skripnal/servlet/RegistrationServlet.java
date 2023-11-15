package ua.skripnal.servlet;

import ua.skripnal.model.DataBase;
import ua.skripnal.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("REGISTRATION SERVLET DOPOST");
        DataBase.getInstance().getUserList().add(new User(req.getParameter("firstName"),req.getParameter("lastName"), req.getParameter("email"),req.getParameter("password"),"user"));
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }
}
