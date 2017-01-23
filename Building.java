package composition;
public class Building 
{
    private String buildingName;
    private Room[] buildingRoom;
    public Building()
    {
        buildingRoom = new Room[10];    
    }
    public Building(String name,int numOfRoom)
    {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildRoom();
    }
    public void buildRoom()
    {
        for(int i=0;i<buildingRoom.length;i++)
        {
            buildingRoom[i] = new Room("SIT- "+(i+1));
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
    public String toString() 
    {
        String result ="Building Name: "+buildingName+"\n";
        for(Room r: buildingRoom)
        {
            result+=r+"\n";
        }
        return result;
    }

}
