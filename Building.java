package int105;
public class Building{
    private String buildingName;
    private Room[] buildingRoom;
   
    public Building(String name){
       //buildingRoom = new Room[10];
       this(name,10);
    }
    
    public Building(String name, int numOfRoom){
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildRoom();
    }
    
    public void buildRoom(){
        for(int i = 0; i < buildingRoom.length; i++){
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

    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Building ){
            Building bd = (Building)obj;
            if(buildingName.equals(bd.buildingName)){
                if(buildingRoom.length==bd.buildingRoom.length){
                    for(int i=0; i<buildingRoom.length; i++){
                        if(!buildingRoom[i].equals(bd.buildingRoom[i])){
                            break;
                        }
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        String result = "Building Name : "+buildingName+"\n";
        for(Room r: buildingRoom){
            result+=r+"\n";
        }
        return result;
        //return "Building{" + "buildingName=" + buildingName + ", buildingRoom=" + buildingRoom + '}';
    }
    
}
