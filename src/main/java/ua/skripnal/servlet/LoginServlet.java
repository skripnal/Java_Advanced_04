package ua.skripnal.servlet;

import ua.skripnal.model.DataBase;
import ua.skripnal.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LOGIN SERVLET DOGET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LOGIN SERVLET DOPOST");

        for (User user : DataBase.getInstance().getUserList()){
            if (user.getEmail().equals(req.getParameter("email"))){
                if (user.getPassword().equals(req.getParameter("password"))){
                    HttpSession session = req.getSession();
                    session.setAttribute("user", user);
                    req.getRequestDispatcher(getRedirectRole(user.getRoot())).forward(req,resp);
                    return;
                }
            }
        }
        System.out.println("Email or password wrong");
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    private String getRedirectRole(String root){
        if (root == "admin"){
            return "/adminPage.jsp";
        }else{
            return "/userPage.jsp";
        }
    }
}
