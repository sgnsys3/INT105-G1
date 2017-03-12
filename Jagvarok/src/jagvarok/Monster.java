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
    
    /* Constructor */
    public Monster() {
    }

    public Monster(String name, int level, int Hp, int characterType, int exp, Skill skillSet) {
        super(name, level, Hp, characterType, -1, 20);
        this.characterType=characterType;
        if(this.characterType!=2){
            this.characterType=2;
        }
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
                    System.out.println(this.name+" died.\n");
                }
            }
        }
    }

    
    /* toString */
    @Override
    public String toString() {
        System.out.println("======================="); 
        return convertType(this.characterType) + " Info\n" + "Name : " + this.name + 
                "\nHP : " + this.Hp + "\nSkill : " + skillSet;
    }


    
}
