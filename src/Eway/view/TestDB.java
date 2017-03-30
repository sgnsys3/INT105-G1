package Eway.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author spinPC
 */
public class TestDB {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Driver not found:" +e);
        }
         
      Connection con = null;
       String url = "jdbc:derby://localhost:1527/saja";
       String username = "saja";
       String password = "saja";
        try {
            con  =  DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}

