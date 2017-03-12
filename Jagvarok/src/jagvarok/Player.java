package jagvarok;

/**
 *
 * @author Imagine
 */
public class Player extends Character{
    Skill skillSet; // Skill สำหรับ Player
    private String name; // ชื่อ Player
    private int level; // level Player
    private int Hp; // Hit Point
    private int characterType; // 0 NPC , 1 Player , 2 Monster , 3 Boss
    private int job; // 0 Novice , 1 Archer , 2 Swordman , 3 Mage
    private int exp; // ระบบ exp สำหรับ uplevel ตัวละคร

    /* Constructor */
    public Player() {
    }

    public Player(String name, int level, int Hp, int characterType, int job, int exp, Skill skillSet) {
        this.name = name;
        this.characterType = characterType;
        if(characterType!=1){
            this.characterType=1;
        }
        if(level>1||level<=1){
            this.level=1;
        }
        if(exp>0||exp<0){
            this.exp=0;
        }
        this.Hp = Hp;
        this.job = job;
        this.skillSet = skillSet;
    }
    /* End Constuctor */

    /* setter / getter */
    public Skill getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Skill skillSet) {
        this.skillSet = skillSet;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
        //เช็คว่า ถ้า Hp น้อยกว่า 0 ให้ Hp = 0
        if(this.Hp<=0){
            this.Hp=0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /* end setter / getter */
    
    public void attack(Character mon,int i){
        /* method ใช้สำหรับ โจมตี Monster 
        หรือ ก็คือ นำ Damage จาก skill ไป ลด
        Hp ของ Monster โดยจะรับ object
        character Monster และ รับ Damage
        จากสกิลที่จะใช้มาคำนวน */
        if(mon instanceof Monster){
        /* ในเริ่มต้นจะเช็คก่อนว่า เป็น object Monster หรือไม่
        ถ้าใช่ก็ทำต่อ ถ้าไม่ใช่ ก็จะส่งข้อความเตือนว่า ให้ใส่เฉพาะ object
        Monster เท่านั้น */
            if(this.Hp!=0){
                /* แสดงข้อความว่าใครเป็นคนโจมตี เพื่อเช็คว่า เข้า เงื่อนไขหรือไม่*/
                System.out.println("\n<<<<<<"+this.name+" Attack>>>>>>\n");
                mon.setHp(mon.getHp()-this.skillSet.getDamage(i));
                /* ใช้ getter นำ Damage ช่องที่ i มาใช้คำนวน
                เนื่องจาก skill เก็บเป็น Arrays จึงต้องรับค่า i นำมาใส่ใน get ด้วย
                เพื่อชี้ตำแหน่งที่อยู่ของ ค่าที่เก็บ Damage ไว้ */
                if(mon.getHp()==0){
                    /* เงื่อนไขนี้คือหาก Monster ตาย ให้แสดงข้อความว่า
                    Monster died. */
                    System.out.println(this.name+" died.\n");
                }
            }
            /* เงื่อนไขนี้บอกว่า ถ้าค่า Hp ของ object นี้ == 0
            จะไม่สามารถโจมตีได้ ( object นี้ตายแล้ว ) 
            และแสดงข้อความออกมา */
            else System.out.println("Can't Attack,You died.");
        }
        else System.out.println("\n@@@@Please attack on Monster@@@@\n");
    }
    
    /* toString */
    /* มีการใช้ method ที่สืบทอดมา คือ convertJob และ convertType 
    ที่ได้อธิบายใน Character.java */
    @Override
    public String toString() {
        System.out.println("======================="); 
        return convertType(this.characterType) + " Info\n" + "Name : " + this.name + 
                "\nLevel : " + level + "\nHP : " + this.Hp + "\nType : " + convertType(characterType) + 
                "\nJob : " + convertJob(job) +"\nSkill : " + skillSet;
    }
    
    
}
    