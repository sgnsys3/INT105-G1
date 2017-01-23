/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buliding;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author INT105
 */
public class Building {
    private String buildingName;
    private Room[] buildingRoom;
    
    public Building(String name){
       // buidingRoom = new Room[10];
        this(name,10);
    }

    public Building(String name, int numOfRoom) {
          buildingName = name;
          buildingRoom = new Room[numOfRoom];
          builRoom();
    }
    
    public void builRoom(){
        for(int i=0;i< buildingRoom.length;i++){
             buildingRoom[i]= new Room("SIT- "+(i+1));
        
     }
    }

    public String getBuidingName() {
        return buildingName;
    }

    public void setBuidingName(String buidingName) {
        this.buildingName = buidingName;
    }

    public Room[] getBuidingRoom() {
        return buildingRoom;
    }

    public void setBuidingRoom(Room[] buidingRoom) {
        this.buildingRoom = buidingRoom;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Room[] getBuildingRoom() {
        return buildingRoom;
    }

    public void setBuildingRoom(Room[] buildingRoom) {
        this.buildingRoom = buildingRoom;
    }
    
    

    @Override
    public String toString() {
        String result = "Building Name: "+buildingName;
        for(Room r:buildingRoom){
        result+= r+"\n";
    }
        return result;
     //To change body of generated methods, choose Tools | Templates.
    }

    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Building){
           Building bd=(Building)obj;
            if((buildingName.equals(bd.buildingName))&&(buildingRoom.length==bd.buildingRoom.length)){
            result = true;
            for(int i=0;i< buildingRoom.length;i++){
                 if(!buildingRoom[i].equals(bd.buildingRoom[i])){
                    result = false;
                    break;
           }
         
         }
        }
        }
        return result;
    }

   /* public boolean equals(Object obj) {
        boolean result = false;
       if(obj != null&& obj instanceof Building){
           Building bn=(Building)obj;
           if((buildingName.equals(bn.buildingName))){
               result = true;
           }for(int i=0;i< buildingRoom.length;i++){
             if((buildingRoom[i].equals(bn.buildingRoom[i]))){
               result = true;
           }
         
         }
           
       }
       return result;
    }
   
    
    */
    
}
