/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bartsam
 */
public class Conexion {
    
        Connection con;
    String url = "jdbc:mysql://localhost:3306/bdcarritocompras";
    String user = "root";
    String pass = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
              System.out.println("Pasa por Conexion");
        } catch (Exception e) {
        }
        return con;
    }
    
}
