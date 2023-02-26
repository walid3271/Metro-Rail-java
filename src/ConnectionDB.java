import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionDB {
    Connection con=null;
    public static Connection connect() {
        try
        {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro_rail_management_system?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
           return con;
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Database connection problem.");
        }
        return null;
    }
}
