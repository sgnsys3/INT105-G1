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
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
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
                    //แก้บัค ดึงชื่อผิดแล้ว จากครั้งก่อนดึงชื่อ Player แสดง
                    System.out.println(mon.getName()+" died.\n");
                    /* เพิ่ม EXP จากการ ฆ่า Monster */
                    gainExp(mon);
                    /* เช็ค เลเวล และ อัพ เลเวล */
                    upLevel();
                    /* เช็ค การตีบอส ถ้าฆ่าบอสจะได้ฉายา */
                    checkMvp(mon);
                }
            }
            /* เงื่อนไขนี้บอกว่า ถ้าค่า Hp ของ object นี้ == 0
            จะไม่สามารถโจมตีได้ ( object นี้ตายแล้ว ) 
            และแสดงข้อความออกมา */
            else System.out.println("Can't Attack,You died.");
        }
        else System.out.println("\n@@@@Please attack on Monster@@@@\n");
    }
    
    /* สำหรับ เพิ่ม EXP ผู้เล่น เมื่อ ฆ่า Monster */
    public void gainExp(Character mon){
        /* กำหนดว่า ถ้าหาก Level ของ Player 
        ต่างกับ Level Monster 10 เลเวล หรือมากกว่า 
        จะได้รับ EXP ของ monser เป็น 10% 
        ของ EXP ที่ Monster มี */
        if((this.level-mon.getLevel())>=10){
            this.exp+=(mon.getExp()*0.1);
            System.out.println("[System] EXP +"+(int)(mon.getExp()*0.1));
        }
        /* กำหนดว่า ถ้าหาก Level ของ Player 
        ต่างกับ Level Monster 5 เลเวล หรือมากกว่า 
        จะได้รับ EXP ของ monser เป็น 50% 
        ของ EXP ที่ Monster มี */
        else if((this.level-mon.getLevel())>=5){
            this.exp+=(mon.getExp()*0.5);
            System.out.println("[System] EXP +"+(int)(mon.getExp()*0.5));
        }
        /* กำหนดว่า ถ้าหาก Level ของ Player 
        เท่ากับ Level Monster จะได้รับ EXP 
        ของ monser เป็น 80% ของ EXP ที่ Monster มี */
        else if((this.level-mon.getLevel())>=0){
            this.exp+=(mon.getExp()*0.8);
            System.out.println("[System] EXP +"+(int)(mon.getExp()*0.8));
        }
        /* เงื่อนไขนี้ บอกว่า ถ้า Level ของ Player 
        น้อยกว่า Level ของ Monster จะได้รับ EXP
        แบบไม่ถูกหัก % */
        else {
            this.exp+=mon.getExp();
            System.out.println("[System] EXP +"+(int)mon.getExp());
        }
    }
    
    /* ส่วนที่เพิ่มเติม */
    /* กำหนดว่าถ้า exp ที่มี เยอะกว่า 120*Level
    จะให้ Level up และ Reset EXP ให้เป็น 0 เพื่อเก็บใหม่ */
    public void upLevel(){
        if(this.exp>=((120)*this.level)){
            this.level++;
            //แสดงว่า Level เพิ่ม
            System.out.println("[System] Level UP !");
            //reset exp ให้ผู้เล่นเก็บใหม่ เพื่อความยากในการเก็บ Level
            this.exp=0;
        }
    }
    
    /* ฉายา MVP ได้จากการฆ่า Boss 
    โดยถ้าเป็นคนฆ่าบอส จะได้รับฉายาไปเป็น [MVP ชื่อบอส] 
    ติดตัวไปตลอด โดยเช็คจาก ชนิดของ Monster และ
    ตัวอักษรตัวแรกของชื่อ Player ว่า != '[' */
    public void checkMvp(Character mon){
        if(mon instanceof Monster){
            if(mon.getCharacterType()==3&&(this.name.charAt(0)!='[')){
                this.name="[MVP "+mon.getName()+"] "+this.name;
            }
        }
    }
    /* เปลี่ยนคลาส ตัวละครเมื่อมี Level >= 10 
    โดยระบบจะเปลี่ยนหากมีเลเวลครบกำหนด 
    โดยจะอิงจากคลาสก่อนและนำค่า job += 10 
    ทำให้ได้เลข job ที่แตกต่าง และแปลงเป็น String
    ใน method convertJob ต่อไป */
    public void changeClass(){
        if(this.level>=10){
            this.job+=10;
        }
    }
    
        /* แปลงเลขอาชีพเป็น String */
    public String convertJob(int job){
        /* โดยสร้างตัวแปร String 1 ตัวเพื่อคอยเก็บค่า
        เมื่อ ชนิดเข้า case ไหน ก็จะแปลงค่าในตัวแปร String
        เป็นค่านั้น และ return ค่าออกไปเป็น String */
        String nameJob="";  
        switch(job){
            /* ในที่นี้ให้ 
            0 = Novice
            1 = Archer
            2 = Swordman
            3 = Mage
            อื่นๆ คือ Unknown */
            case(0):nameJob="Novice";break;
            case(1):nameJob="Archer";break;
            case(2):nameJob="Swordman";break;
            case(3):nameJob="Mage";break;
            /* ส่วนที่เพิ่มเติม 
            เพิ่มคลาส 2 โดยมี 4 คลาส 
            ตามสายอาชีพต่างๆ */
            case(10):nameJob="Super Novice";break; // จาก Novice
            case(11):nameJob="Hunter";break; // จาก Archer
            case(12):nameJob="Knight";break; // จาก Swordman
            case(13):nameJob="Wizard";break; // จาก Mage
            default:nameJob="Unknown";break;
        }
        return nameJob;
    }
    
    /* toString */
    /* มีการใช้ method ที่สืบทอดมา คือ convertJob และ convertType 
    ที่ได้อธิบายใน Character.java */
    @Override
    public String toString() {
        System.out.println("======================="); 
        return convertType(this.characterType) + " Info\n" + "Name : " + this.name + 
                "\nLevel : " + level + "\nHP : " + this.Hp + "\nType : " + convertType(characterType) + 
                "\nJob : " + convertJob(this.job) + "\nEXP : "+ this.exp +"\nSkill : " + skillSet;
    }
    
    
}
    