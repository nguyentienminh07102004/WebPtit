package CONTROLLER;

import DAO.StudentCRUD;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name="approved", urlPatterns = {"/approved"})
public class Approved extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        System.out.println(id);
        try {
            StudentCRUD.UpdateStudent(id);
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        resp.sendRedirect("view");
    }
    
}
