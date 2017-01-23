/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buliding;

/**
 *
 * @author INT105
 */
public class TestBuilding {
    public static void main(String[] args){
        Building b1 = new Building("LX Building",10);
        Building b2 = new Building("LX Building",20);
        
        Room r1 =new Room("Room");
        Room r2 =new Room("Room");
        System.out.println(b1.equals(b2));
        //System.out.println(b1.equals(b2));
      
    }
    
}
