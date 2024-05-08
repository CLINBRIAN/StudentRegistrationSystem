
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamau
 */
public class DatabaseConnection {
    //C:\mysql-connector-j-8.4.0
    final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL= "jdbc:mysql://localhost:3306/student";
    
    final static String username= "root";
    final static String password = "";
    
    public static Connection connection(){
    
        try {
            Class.forName(JDBC_DRIVER);
             Connection conn = DriverManager.getConnection(DB_URL, username, password);
             return conn;
   
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;

    }
    
    
    
    
    }   
    
}
