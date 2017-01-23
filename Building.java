package int105.g1;
public class Building { //composite class
   private String buildName;
   Room[] buildRoom; //component class //whole-part
   
   public Building(String name){
//       buildName = name;
//       buildRoom = new Room[10];
      this(name,10);
   }
   
   public Building(String name,int numOfRoom){
       buildName = name;
       buildRoom = new Room[numOfRoom];
       buildRoom();
   }
   
   public void buildRoom(){
       for(int i = 0;i<buildRoom.length;i++){
           buildRoom[i] = new Room("SIT"+(i+1));
       }
   }
   
   public void replaceNameRoom(String a,int n){
        for(int i =0;i<buildRoom.length;i++){
           if(i == n-1){
               buildRoom[i].setRoomName(a);
           }
        }
   }
   
   public void setBuildName(String buildName) {
       this.buildName = buildName;
   }

   public void setBuildRoom(Room[] buildRoom) {
       this.buildRoom = buildRoom;
   }

   public String getBuildName() {
       return buildName;
   }

   public Room[] getBuildRoom() {
       return buildRoom;
   }

    @Override
    public String toString() {
        String result = "Bulding Name :" + buildName + "\n";
        for(Room r : buildRoom){
            result += r +"\n";
        }
        return result;
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        if(obj != null && obj instanceof Building){
            Building temp = (Building)obj;
            if(buildName.equals(temp.buildName)&& 
               buildRoom.length == (temp.buildRoom).length) 
            {
                result = true;
                for(int i = 0;i<buildRoom.length;i++){
                   if(!buildRoom[i].equals(temp.buildRoom[i])){
                       result = false;
                       break;
                   }
                }
            }
        }
        return result;
    }
   
   
}
