/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.util.Objects;

/**
 *
 * @author INT105
 */
public class Room {
    private String roomName;

    public Room() {
    }
    
    public Room(String roomName) {
        this.roomName = roomName;
    }
    
    

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "Room{" + "roomName=" + roomName + '}';
    }


    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof Room){
                Room rm = (Room)obj;
                if(roomName.equals(rm.roomName)){
                    result=true;
                }
        }
        return result;
    }
    
    
    
}
