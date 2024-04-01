/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

@WebServlet(name = "Delete", urlPatterns = {"/delete"})
public class ConfirmDelete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("Id", id);
        req.getRequestDispatcher("ConfirmDelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String confirm = req.getParameter("confirm");
        String cancel = req.getParameter("cancel");
        if (cancel != null) {
            resp.sendRedirect("view");
        } else if (confirm != null) {
            try {
                String id = req.getParameter("id");
                System.out.println(id);
                StudentCRUD.DeleteStudent(id);
            } catch (ClassNotFoundException | SQLException ex) {

            }
            resp.sendRedirect("view");
        }
    }
}
