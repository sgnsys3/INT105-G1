/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

import java.util.Objects;

/**
 *
 * @author INT105
 */
public class Room {

    private String roomName;

    public Room() {
    }

    public Room(String roonName) {
        this.roomName = roonName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roonName) {
        this.roomName = roonName;
    }

    @Override
    public String toString() {
        return "Room{" + "roomName=" + roomName + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof Room) {
            Room tem = (Room)obj;
            if(roomName.equals(tem.roomName))
                return true;
        }
        return false;
    }

}
