package building;
public class Building {//composite class
    private String buildingName;
    private Room[] buildingRoom;//component class
 
    public Building(){
        buildingRoom = new Room[10];
    }
    public Building(String name,int numOfRoom){
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
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
    public void buildRoom(){
        for(int i = 0; i < buildingRoom.length; i++){
            buildingRoom[i] = new Room("SIT- "+(i+1));
        }
    }
    @Override
    public String toString(){
        String result = "Building Name : "+buildingName+"\n";
        for(Room r: buildingRoom){
            result += r+"\n";
        }
        return result;
    }

    public boolean equals(Object obj){
        boolean result = false;
        boolean result1 = false;
        if(obj != null && obj instanceof Building){
            Building rm = (Building) obj;
            if(buildingName.equals(rm.buildingName) && buildingRoom.length == rm.buildingRoom.length){
                 result = true;
                 for(int i = 0; i < buildingRoom.length; i++){
                     if(!buildingRoom[i].equals(rm.buildingRoom[i])){
                         result1 = false;
                         break;
                     }
                 }
            }
        }
        return result;
    }
}
