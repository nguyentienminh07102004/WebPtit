/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
public class DAO {
    private static String url = "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false";
    private static String user = "root";
    private static String pass = "Minhnguyen12345!";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (Connection)DriverManager.getConnection(url, user, pass);
    }
}

