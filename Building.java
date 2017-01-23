/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

/**
 *
 * @author INT105
 */
public class Building {

    private String name;
    private Room room[];

    public Building() {

    }

    public Building(String name) {
        this(name, 10);
    }

    public Building(String name, int numberOfRoom) {
        this.name = name;
        room = new Room[numberOfRoom];
    }

    public void buildRoom() {
        for (int i = 0; i < room.length; i++) {
            room[i] = new Room("SIT" + (i + 1));
        }
    }

    public String getName() {
        return name;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    @Override
    public String toString() {
        String tem = "";
        for (Room a : room) {
            tem += a + "\n";
        }
        return "Building{" + "name=" + name + ", room\n" + tem + '}';
    }
    @Override
    public boolean equals(Object obj) {
        boolean ck = false;
        if (obj!=null && obj instanceof Building) {
            Building tem = (Building)obj;
            if(name.equals(tem.name)){
                if(room.length==tem.room.length){
                    ck = true;
                    for(int i=0;i<room.length;i++)
                        if(!(room[i].equals(tem.room[i]))){
                            ck = false;
                            break;
                        }
                }
            }
                
        }
        return ck;
    }
}
