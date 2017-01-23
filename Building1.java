/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package building1;

public class Building1 {

    private String buildingName;
    private Room[] buildingRoom;
    
    public Building1(){
        
    }
    
    public Building1(String name){
       // buildingRoom = new Room[10];
       this(name,10);
       buildRoom();
    }
     public Building1(String name,int numofRoom){
        buildingName = name;
        buildingRoom = new Room[numofRoom];
        buildRoom();
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setBuildingRoom(Room[] buildingRoom) {
        this.buildingRoom = buildingRoom;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public Room[] getBuildingRoom() {
        return buildingRoom;
    }
   
    public void buildRoom(){
        for(int i=0;i<buildingRoom.length;i++){
            buildingRoom[i] = new Room("FIFAWORLD-"+ (i+1));
        }
    }
    @Override
    public boolean equals(Object obj){
      boolean boo = false;
      if(obj != null && obj instanceof Building1){
          Building1 building = (Building1)obj;
          if(buildingName.equals(building.buildingName) && buildingRoom.length == building.buildingRoom.length){
              for(int i = 0;i<buildingRoom.length;i++){
                  if(buildingRoom[i].getRoomName().equals(building.buildingRoom[i].getRoomName())){
                      
                  }else boo =false;
                      boo = true;
              }
          }else boo =false;
      }else boo =false;
      return boo;
      /*Building1 building =  (Building1)obj;
      if( obj instanceof Building1 && obj != null){
      if(building.buildingName.equals(buildingName)){
        if(building.buildingRoom.length == buildingRoom.length){
            for(int i=0;i<buildingRoom.length;i++){
                if(buildingRoom[i].getRoomName().equals(building.buildingRoom[i].getRoomName())){
                    boo = true;
            }else boo = false;    
            }
        }else boo = false;
      }else boo = false;
            
    }else boo = false;
      return boo;*/
    }
    
    @Override
    public String toString() {
        String result = "Building Name: "+buildingName+"\n";
        for(Room r:buildingRoom){
            result+=r+"\n";
        }
        return result;
        //return "Building1{" + "buildingName=" + buildingName + ", buildingRoom=" + buildingRoom + '}';
    }

    
    
    
    
}


