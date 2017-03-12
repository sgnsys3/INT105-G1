package jagvarok;

/**
 *
 * @author Imagine
 */
public class Skill {
    private String name[]; 
    private int damage[];
    // ชื่อสกิลและดาเมจ เก็บเป็น arrays เพราะเป็น skill Set อาชีพนั้นๆ
    
    /* Constuctor */
    public Skill() {
    }

    public Skill( String[] name, int[] damage) {
        this.name = name;
        this.damage = damage;
    }
    /* end Constuctor */
    
    /* setter / getter */
    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
    
    /* getter ตัวนี้มีความพิเศษที่จะ รับ ค่า index ผ่าน parameter
        และเรียกค่าที่อยู่ใน Arrays ของ Damage ใน index ตามที่รับค่ามา */
    public int getDamage(int i) {
        return damage[i];
    }

    public void setDamage(int[] damage) {
        this.damage = damage;
    }
    /* end setter / getter */
    
    /* toString */
    /* จะมีการ ใช้ for each เพื่อแสดง
    รายชื่อสกิล และ list ของ Damage 
    จาก Arrays ที่เก็บค่าเหล่านี้ไว้
    และเก็บลงใน ตัวแปร String และแสดงค่าออกมา */
    @Override
    public String toString() {
        String resultName="";
        for(String a : name){
            resultName+=", "+a+" ";
        }
        String resultDmg=" ";
        for(int a : damage){
            resultDmg+=", "+a+" ";
        }
        return " Name " + resultName + "\n\t Damage " + resultDmg;
    }

    
}
