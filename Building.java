/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nattapon;

/**
 *
 * @author INT105
 */
public class Building {

    private String buildingName;
    private Room[] buildingRoom;
    private Object building;

    public Building() {
        buildingRoom = new Room[10];
    }

    public Building(String name, int numOfRoom) {
        buildingName = name;
        buildingRoom = new Room[numOfRoom];
        buildRoom();
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

    public void buildRoom() {
        for (int i = 0; i < buildingRoom.length; i++) {
            buildingRoom[i] = new Room("SIT" + "-" + (i + 1));
        }
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Building) {
            Building bd = (Building) obj;
            if (buildingName.equals(bd.buildingName) && buildingRoom.length == bd.buildingRoom.length) {
                for (int i = 0; i < buildingRoom.length; i++) {
                    if (buildingRoom[i].equals(bd.buildingRoom[i])) {
                        result = true;
                    } else {
                        break;
                    }

                }
            }
        }
        return result;
    }

    public String toString() {
        String result = "Building Name" + buildingName + "\n";
        for (Room r : buildingRoom) {
            result += r + "\n";
        }
        return result;
    }
}
