/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlConnect;
import java.sql.*;
/**
 *
 * @author sarina
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_GoGrocer","root","sarina123");
            return con;
            
        }
    
        catch(Exception e){
            return null;
        }
    }
}
