/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author ngari
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
            Class.forName("com.nysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
    }
        
}
