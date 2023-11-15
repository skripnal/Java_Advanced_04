package ua.skripnal.servlet;

import ua.skripnal.model.DataBase;
import ua.skripnal.model.Magazine;
import ua.skripnal.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/removeUserMagazineServlet")
public class RemoveUserMagazineServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int magazineId = Integer.parseInt(req.getParameter("magazineId"))-1;
        Magazine magazine = DataBase.getInstance().getMagazineList().get(magazineId);
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");

        user.removeMagazineFromUser(magazine);
        resp.sendRedirect("/userPage.jsp");
    }
}
