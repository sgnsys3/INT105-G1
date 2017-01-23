/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author INT105
 */
public class Building {
    private String buildingName;
    private Room[] buildingRoom;

    public Building(String name) {
//        buildingName = name;
//        buildingRoom = new Room[10];
        this(name, 10);
    }

    public Building(String name, int numOfRoom) {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
//        buildRoom();
    }
    
    public void buildRoom(){
        for(int i=0;i<buildingRoom.length;i++){
            buildingRoom[i]= new Room("SIT" +(i+1));
        }
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
        String result="";
        for(Room r: buildingRoom){
            result+= ""+ r +"\n";
        }
        return result;
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Building){
            Building b = (Building)obj;
            if(buildingName.equals(b.buildingName) &&
               (buildingRoom.length==b.buildingRoom.length)){
                result = true;
                for(int i=0;i<buildingRoom.length;i++){
                    if(!buildingRoom[i].equals(b.buildingRoom[i]))
                        result = false;
                }
            }
        }
        return result;
    }
}
