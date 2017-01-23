package int105g1;
public class Building {
    private String name;
    private Room[] room;
   
    public Building(String name){
        this(name,10);
    }
    
    public Building(String name,int roomNum){
        this.name = name;
        room = new Room[roomNum];
        buildRoom();
    }
    
    public void buildRoom(){
        for(int i=0; i<room.length;i++){
            room[i] = new Room("SIT-"+(i+1));
        }
    }

    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null & obj instanceof Building){
            Building other = (Building)obj;
            if(name.equals(other.name)){
                if(room.length==other.room.length){
                    for(int i=0;i<room.length;i++){
                        if(!room[i].equals(other.room[i])){
                            break;
                        }
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        String output = "";
        for(Room r:room){
            output += r+"\n";
        }
        return "Building Name : " + name + "\n" + output + '}';
    }
}