package javagroup1;
public class Building {

    private String buildingName;
    private Room[] buildingroom;

    public Building(String name) {
        this(name, 10);
    }

    public Building(String name, int numOfRoom) {
        buildingName = name;
        buildingroom = new Room[numOfRoom];
       buildRoom();
    }

    public void buildRoom() {
        for (int i = 0; i < buildingroom.length; i++) {
            buildingroom[i] = new Room("SIT-" + (i + 1));
        }
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Room[] getBuildingroom() {
        return buildingroom;
    }

    public void setBuildingroom(Room[] buildingroom) {
        this.buildingroom = buildingroom;
    }

    @Override
    public String toString() {
        String result = "Building Name : " + buildingName + "\n";
       // Iterable<Room> buildingRoom = null;
        for (Room r : buildingroom) {
            result += r + "\n";
        }
        return result;
    }
   // @Override
   public boolean equal(Object obj){
    boolean result = false;
    if(obj!=null&& obj instanceof Building){
        Building bd = (Building)obj;
        if(buildingName.equals(bd.buildingName) && buildingroom.length==bd.buildingroom.length){
        result = true;
        for(int i=0;i<buildingroom.length;i++){
            if(buildingroom[i].equals(bd.buildingroom[i])){
            result = false;
            break;
            }
        }
        }
    }
    return result;
   }
}
