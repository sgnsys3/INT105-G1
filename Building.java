package company;

public class Building {

    
    private String buildingName ;
    private Room[] buildingRoom;
    
    public Building(){
        this("",10);
        buildRoom();
    }

    public Building(String name, int numOfRoom) {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildRoom();
    }
    
    public void buildRoom(){
        for(int i=0;i<buildingRoom.length;i++){
            buildingRoom[i]=new Room("SIT-"+(i+1));
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
        String result ="Buliding Name: "+buildingName+"\n";
        for(Room r: buildingRoom){
            result +=r+"\n";
        }
        return result;
        //return "Building{" + "buildingName=" + buildingName + ", buildingRoom=" + buildingRoom + '}'; 
    }
    
//    public boolean equals(Object obj){
//        boolean boo = false;
//        Building building = (Building) obj;
//        if(obj instanceof Building && obj !=null){
//            if(building.buildingName.equals(buildingName)){
//                if(building.buildingRoom.length == buildingRoom.length){
//                    for(int i =0 ; i<buildingRoom.length;i++){
//                        if(buildingRoom[i].getRoomName().equals(building.buildingRoom[i].getRoomName())){
//                        boo = true;
//                        
//                    }else boo = false;
//                    }
//                }else boo = false;
//            }else boo = false;
//        }else boo = false;
//        return boo;
//    }
    public boolean equals(Object obj){
        boolean result=false;
        if(obj != null && obj instanceof Building){
            Building bd = (Building)obj;
            if(buildingName.equals(bd.buildingName)&&
                buildingRoom.length==bd.buildingRoom.length){
                result=true;
                for(int i=0;i<buildingRoom.length;i++){
                    if(!buildingRoom[i].equals(bd.buildingRoom[i])){
                        result=false;
                        break;
                    }
                }
            }
        }
        return result;
    }
     
}
