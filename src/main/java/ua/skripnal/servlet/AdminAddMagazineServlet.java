package ua.skripnal.servlet;

import ua.skripnal.model.DataBase;
import ua.skripnal.model.Magazine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminAddMagazineSetvlet")
public class AdminAddMagazineServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ADMIN PAGE DOPOST");
        DataBase.getInstance().getMagazineList().add(new Magazine(req.getParameter("adminTitleInput"),req.getParameter("adminDescriptionInput"),Double.parseDouble(req.getParameter("adminCostInput"))));
        req.getRequestDispatcher("/adminPage.jsp").forward(req,resp);
    }
}
