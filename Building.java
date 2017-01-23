package testbuilding;
public final class Building {
    private String buildingName;
    private Room[] buildingRoom;

    public Building() {
        buildingRoom = new Room[10];
        buildRoom();
    }

    public Building(String name,int numOfRoom) {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildRoom();
    }
    
    public void buildRoom(){
        for(int i = 0 ;i < buildingRoom.length ; i++){
            buildingRoom[i] = new Room("SIT-"+(i+1));
        }
    }

    public String getBuildingName() {
        return buildingName;
    }

    public Room[] getBuildingRoom() {
        return buildingRoom;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setBuildingRoom(Room[] buildingRoom) {
        this.buildingRoom = buildingRoom;
    }

    @Override
    public String toString() {
        String room = "\n";
        for(int i = 0 ; i<=buildingRoom.length-1 ; i++){
            room += buildingRoom[i]+"\n";
        }
        return "BuildingName : " + buildingName +"\n"+ 
               "BuildingRoom : " + room;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Building){
            Building bd = (Building) obj;
            if(buildingName.equals(bd.buildingName)&&
               buildingRoom.length==bd.buildingRoom.length){
                for(int i = 0 ; i <buildingRoom.length ; i++){
                    if(!buildingRoom[i].equals(bd.buildingRoom[i])){
                        result = false;
                        break;
                    }
                    result = true;
                }
                
            }
        }
        return result;
    }
}