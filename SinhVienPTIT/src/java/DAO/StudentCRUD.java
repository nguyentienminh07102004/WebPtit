/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Student;
import java.util.ArrayList;
import java.sql.*;

public class StudentCRUD extends DAO{
    public static ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException{
        String sql = "SELECT * FROM studentlist;";
        PreparedStatement pre = getConnection().prepareStatement(sql);
        ResultSet set = pre.executeQuery();
        ArrayList<Student> arr = new ArrayList<Student>();
        while(set.next()){
            Student student = new Student(set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getInt(5));
            arr.add(student);
        }
        return arr;
    }
    public static void DeleteStudent(String id) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM studentlist WHERE id = ?;";
        PreparedStatement pre = getConnection().prepareStatement(sql);
        pre.setString(1, id);
        pre.executeUpdate();
    }
    public static void UpdateStudent(String id) throws ClassNotFoundException, SQLException{
        String sql = "UPDATE studentList SET approved = 1 WHERE id = ?;";
        PreparedStatement pre = getConnection().prepareStatement(sql);
        pre.setString(1, id);
        pre.executeUpdate();
    }
}
