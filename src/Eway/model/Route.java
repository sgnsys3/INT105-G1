package Eway.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Route {

    private int routeId;
    private String destination;
    private String description;
    private String source;

    public Route() {

    }

    public Route(int routeId, String destination, String description, String source) {
        this.routeId = routeId;
        this.destination = destination;
        this.description = description;
        this.source = source;
        if (regisBook()) {
            System.out.println("Success");//ถ้าข้อมูลลงdbได้ ให้ปริ้นคำว่าSuccess
        } else {
            System.out.println("Failed");//ถ้าข้อมูลลงdbได้ ให้ปริ้นคำว่าFailed
        }
    }

    public boolean regisBook() {
        //เก็บข้อมูลต่างๆลงตาราง
        String sqlInsert = "insert into ROUTE(ROUTE_ID, ROUTE_DESTINATION, ROUTE_DESCRIPTION, ROUTE_SOURCE)"
                + " values (?, ?, ?, ?)";
        try {
            //การติดต่อกับdatabase
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement stm = null;
            stm = con.prepareStatement(sqlInsert);

            stm.setInt(1, this.routeId);
            stm.setString(2, this.destination);
            stm.setString(3, this.description);
            stm.setString(4, this.source);
            stm.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
}
