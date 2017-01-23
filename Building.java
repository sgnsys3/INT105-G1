
package lab3102;


public class Building {
    private String buildingName;
    private Room[] buildingRoom;


    
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Room[] getBuildingRoom() {
        return buildingRoom;
    }

    public void setBuildingRoom(int numOfRoom) {
        this.buildingRoom = new Room[numOfRoom];
    }
    
    public Building(String buildingName, int numOfRoom) {
        this.buildingName = buildingName;
        this.buildingRoom = new Room[numOfRoom];
        buildRoom();
    }
    
    public Building() {
        buildingRoom = new Room[10];
    }
    public void buildRoom(){
        for(int i=0;i<buildingRoom.length;i++){
            buildingRoom[i] = new Room("Room-"+(i+1));
        }
    }
    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Building){
            Building bd = (Building)obj;
           if(buildingName.equals(bd.buildingName)){
                if(buildingRoom.length==bd.buildingRoom.length){
                    result = true;
                }else
                    result = false;
           }     
                 
        }
        return result;
    }
    @Override
    public String toString() {
        String result = "Building : " +  buildingName+"\n";
        for(Room r : buildingRoom){
            result += r +"\n";
        }
        return result;
    }
    
    
}
