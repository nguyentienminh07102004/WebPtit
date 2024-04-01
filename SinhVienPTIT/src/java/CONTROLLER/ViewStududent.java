/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.StudentCRUD;
import MODEL.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name="VIEW", urlPatterns = {"/view"})
public class ViewStududent extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ArrayList<Student> arr = StudentCRUD.getAllStudent();
            req.setAttribute("StudentList", arr);
            req.getRequestDispatcher("viewAllStudent.jsp").forward(req, resp);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}
