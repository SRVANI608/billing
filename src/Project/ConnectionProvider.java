/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author windows
 */
public class ConnectionProvider {
    
    static 
            Connection con;
    ResultSet rs;
    public static Connection getCon()
    {
    try        
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Sravani@29");
        return con;
    }
    catch(Exception e)
    {
        System.out.println(e);
                  
    }
    return con;
    
}
}

