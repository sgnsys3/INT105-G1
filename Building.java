package building;
public class Building {
    private String buildingName;
    private Room[] buildingRoom;
    
    public Building(String name){
        buildingName = name;
        buildingRoom = new Room[10];
        buildRoom();
    }
    
    public Building(String name, int numOfRoom){
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
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

    public Room[] getBuildingRoom() {
        return buildingRoom;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setBuildingRoom(Room[] buildingRoom) {
        this.buildingRoom = buildingRoom;
    }

    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Building){
            Building b = (Building)obj;
            if(buildingName.equals(b.buildingName)&&buildingRoom.length==(b.buildingRoom.length)){
                for(int i=0;i<buildingRoom.length;i++){
                    result = true;
                    if(!buildingRoom[i].equals(b.buildingRoom[i])){
                       result = false;
                       break;
                    }
                }
            }
        }
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public boolean equals(Object obj){
//        boolean result = false;
//        if(obj != null&&obj instanceof Building){
//            Building build = (Building)obj;
//            if(buildingName.equals(build.buildingName)&&buildingRoom.length==build.buildingRoom.length){
//                for(int i = 0;i<buildingRoom.length;i++){
//
//                    if(!buildingRoom[i].equals(build.buildingRoom[i])){
//                        result = false;
//                        break;        
//                    }
//                    result = true;
//                } 
//            }  
//        }
//        return result;
//    }
            
    @Override
    public String toString() {
        String result = "Building Name :"+buildingName+"\n"; 
        for(Room r:buildingRoom){
            result +=r+"\n";
        }
        return result;
    }
}
