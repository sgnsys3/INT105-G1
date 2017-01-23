package room;

public class Room {
    private String roomName;
    private String roomType;

    public Room(String roomName, String roomType) {
        this.roomName = roomName;
        this.roomType = roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" + "roomName=" + roomName + ", roomType=" + roomType + '}';
    }
    
        
 }
    
