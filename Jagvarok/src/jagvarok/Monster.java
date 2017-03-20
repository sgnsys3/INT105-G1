package jagvarok;

/**
 *
 * @author Imagine
 */
public class Monster extends Character {
    Skill skillSet; // Skill สำหรับ Monstteer
    private int Hp; // Hit Point
    private String name; // ชื่อของ Monster
    private int characterType; // // 0 NPC , 1 Player , 2 Monster , 3 Boss
    private int exp; // exp เฉพาะ ของ Monster เพื่อนำไปเพิ่ม level Player
    
    /* Constructor */
    public Monster() {
    }

    public Monster(String name, int level, int Hp, int characterType, int exp, Skill skillSet) {
        super(name, level, Hp, characterType, -1, 20);
        this.characterType=characterType;
        if(this.characterType==3){
            this.characterType=3;
        }
        else this.characterType=2;
        this.exp=exp;
        this.name = name;
        this.Hp = Hp;
        this.skillSet = skillSet;
    }
    /* end Constuctor */

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
        if(this.Hp<=0){
            this.Hp=0;
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCharacterType() {
        return characterType;
    }

    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }
    
    /* end setter / getter */
    
    public void attack(Character Player,int i){
        /* ใช้สำหรับ โจมตีผู้เล่น โดยจะเช็คก่อนว่า
        ถ้าเป็น player จึงจะโจมตีได้ และ
        Hp ของ object นี้ ต้อง != 0 
        และจะแสดงข้อความเป็นตัวเช็คว่า เข้าเงื่อนไข */
        if(Player instanceof Player){
            if(this.Hp!=0){
                System.out.println("\n<<<<<<"+this.name+" Attack>>>>>>\n");
                Player.setHp(Player.getHp()-this.skillSet.getDamage(i));
                if(Player.getHp()==0){
                    System.out.println(Player.getName() + " died.\n");
                    /* เรียกใช้ Method ลด EXP */
                    decreaseExp(Player);
                }
            }
        }
    }    
    
    /* Overriding จาก Character.java 
    แต่ไม่อนุญาติให้ Monster เปลี่ยนคลาส */
    public void changeClass(){
        System.out.println("Monster can't Change Class");
    }
    
    /* Method ลด EXP โดยจะลดเมื่อ Player 
    ตาย โดย Monster โดยจะลด 10% จาก EXP ที่มีอยู่ */
    public void decreaseExp(Character Player){
        int exp = Player.getExp();
        Player.setExp((int)(exp-(exp*0.1)));
    }
    
    /* toString */
    @Override
    public String toString() {
        System.out.println("======================="); 
        return convertType(this.characterType) + " Info\n" + "Name : " + this.name + 
                "\nHP : " + this.Hp + "\nSkill : " + skillSet;
    }


    
}
