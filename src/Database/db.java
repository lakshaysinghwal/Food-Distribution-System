/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Arihant Kumar
 */
public class db {
    public static Connection c;
    public static Statement st;
    public static PreparedStatement pst;
    
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotserve","root","admin");
            pst=c.prepareStatement("insert into user (email, fn, ln, mn, pass, address) values(?,?,?,?,?,?)");
            st=c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
        }
        
    }
}
