package jagvarok;

/**
 *
 * @author Imagine
 */
public class Npc extends Character {
    // บอกชนิดของ NPC
    private int typeNpc; // 0 merchant , 1 quest npc , 2 other
    private String name; // ชือ NPC
    private int level;  // Level ของ NPC
    private int Hp; // HP ของ NPC
    private int characterType; 
    // ชนิดของตัวละคร shadowing มาจาก Character

    /* Constructor */
    public Npc() {
    }

    public Npc(String name, int level, int Hp, int characterType, int typeNpc) {
        super(name, level, Hp, characterType, 0, 0);
        this.name = name;
        this.level=level;  
        // กำหนดว่า NPC ทุกตัวเมื่อสร้างแล้ว Level ต้อง 99 ทุกตัว
        if(this.level!=99){
            this.level=99;
        }
        this.Hp=Hp; 
        // กำหนดว่า Hp ขั้นต่ำของ NPC จะเท่ากับ 1000
        if(this.Hp<1000){
            this.Hp=1000;
        }
        this.typeNpc = typeNpc; 
        // กำหนดว่า ถ้าหากไม่ใส่ค่าภายใน 0-2 NPC จะกลายเป็น Other ทุกตัว
        if(typeNpc>2||typeNpc<0){
            this.typeNpc = 2;
        }
        this.characterType = characterType;
        //กำหนดว่า เมื่อสร้าง Object Type เป็น NPC
        //จะต้องมี characterType เป็น 0 เท่านั้น
        if(characterType!=0){
            this.characterType=0;
        }
    }
    /* end Constuctor */
    
    public String convertNpc(int type){
        //แปลงชนิดจาก characterType เป็น String
        //ตามชนิดของ NPC ต่างๆ ใน switch case
        //โดย 0 = merchant , 1 = quest , 2 = other
        String nameType="";
        switch(type){
            case(0):nameType="Merchant";break;
            case(1):nameType="Quest";break;
            case(2):nameType="Other";break;
        }
        return nameType;
    }
    
    //เป็น method โจมตี ของ NPC
    //สร้างเพื่อเผื่อ อนาคตใช้ในการชวย Player โจมตี Monster
    //โดย พลังโจมตีของ NPC = 99999999
    /* * * * * * * * * * * * * * * * * * * *
        ตั้งใจจะไม่ให้ Npc โจมตี
    แต่สร้างในกรณีมีบอทเฝ้ายาม หรือ ให้ Npc ป้องกันตัวเอง
    * * * * * * * * * * * * * * * * * * * */
    public void attack(Character character,int i){
        //สร้างตัวแปรเพื่อ เผื่อแก้ไขค่า damage ภายหลัง
        int damageNpc = 99999999;
        if(character instanceof Monster){
        //โดยเช็คก่อนว่าเป็น object Monster ไหม ถ้าไม่จะไม่สามารถโจมตีได้
            character.setHp(character.getHp()-damageNpc);
        }
        //เมื่อไม่ใช่การโจมตีกับ Monster จะขึ้นข้อความเตือน
        else System.out.println("\n@@@@Attack on Monste Only@@@@\n");
    }

    /* Method ที่ Overriding มา 
    ซึ่ง NPC ไม่สามารถเปลี่ยนคลาสได้ */
    public void changeClass(){
        System.out.println("NPC can't Change Class");
    }
    
    /* toString */
    /* มีการเรียกใช้ convertType() เพื่อแสดงชนิดว่าเป็น Npc ในรูป String
    โดยเป็น convertType ที่สืบทอดมาจาก Character */
    @Override
    public String toString() {
        System.out.println("======================="); 
        return convertNpc(typeNpc)+" "+convertType(this.characterType)+" info\n"+
                "Name : " +this.name+"\nLevel : "+this.level+"\nHP : "+this.Hp;
    }

    
}
    