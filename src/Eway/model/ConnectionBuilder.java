
package Eway.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Volk
 * 
 */
public class ConnectionBuilder {
    public static Connection getConnection() {
       Connection con = null;
       String url = "jdbc:derby://localhost:1527/saja";
       String username = "saja";
       String password = "saja";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con  =  DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }         
            return con;
    }
}
