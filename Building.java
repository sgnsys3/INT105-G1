/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105;

/**
 *
 * @author INT105
 */
public class Building {

    private String buildingName;
    private Room[] buildingRoom;

    public Building(String name) {
        //buildingRoom=new Room[10];
        this(name, 10);
    }

    public Building(String name, int numOfRoom) {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildingRoom();
    }

    public void buildingRoom() {
        for (int i = 0; i < buildingRoom.length; i++) {
            buildingRoom[i] = new Room("SIT-" + (i + 1));
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

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Building) {
            Building buildName = (Building) obj;//cast Building in Obj
            if (buildingName.equals(buildName.buildingName)&&
                    buildingRoom.length == buildName.buildingRoom.length) {
                    for (int i = 0; i < buildingRoom.length; i++) {
                        if (buildingRoom[i].getRoomName().equals(buildName.buildingRoom[i].getRoomName())) {
                            result = true;
                        } else {
                            result = false;
                        }
                    }
                } else {
                    result = false;
                }
            } else {
                result = false;
            }
        
        return result;
    }

    @Override
    public String toString() {
        //return "Building{" + "buildingName=" + buildingName + ", buildingRoom=" + buildingRoom + '}';
        String result = "Building Name: " + buildingName + "\n";
        for (Room r : buildingRoom) {
            result += r + "\n";
        }
        return result;
    }

}
