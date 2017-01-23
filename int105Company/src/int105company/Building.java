/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105company;

/**
 *
 * @author INT105
 */
public class Building {
    private String buildingName;
    private Room[] buildingRoom;
    
    public Building(){
        this("",10);
    }
    public Building(String name, int numOfRoom){
        buildingRoom = new Room[numOfRoom];
        buildingName = name;
        buildRoom();
    }
    
    public void buildRoom(){
        for(int i=0;i<buildingRoom.length;i++){
            buildingRoom[i] = new Room("SIT-"+(i+1));
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
        String output = "";
        for(int i=0;i<buildingRoom.length;i++){
            output += buildingRoom[i]+"\n";
        }
        return "Building{" + "buildingName=" + buildingName + ", buildingRoom=" + output + '}';
    }
    
//    public boolean equals(Object obj){
//        boolean boo = false;
//        Building building = (Building) obj;
//        if(obj instanceof Building && obj != null){
//            if(building.buildingName.equals(buildingName)){
//                if(building.buildingRoom.length==buildingRoom.length){
//                    for(int i=0;i<buildingRoom.length;i++){
//                        if(buildingRoom[i].getRoomName().equals(building.buildingRoom[i].getRoomName())){
//                            boo = true;
////                            continue;
//                        }else boo = false;
//                    }
//                }else boo = false;
//            }else boo = false;
//        }else boo = false;
//        return boo;
//    }
    
    public boolean equals(Object obj){
        boolean boo = false;
        Building bd = (Building) obj;
        if(obj instanceof Building && obj != null){
           if(bd.buildingName.equals(buildingName) && bd.buildingRoom.length == buildingRoom.length){
                for(int i=0;i<buildingRoom.length;i++){
                    if(bd.buildingRoom[i].equals(buildingRoom[i])){
                        boo = true;
                    }
                }
            } 
        }
        return boo;
    }
    
}
