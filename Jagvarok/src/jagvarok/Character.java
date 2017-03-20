package jagvarok;

/**
 *
 * @author Imagine
 */
abstract class Character {
    private String name; // ชื่อตัวละคร
    private int level; // level ตัวละคร
    private int Hp; // Hit Point
    private int characterType; // 0 NPC , 1 Player , 2 Monster , 3 Boss
    private int job; // 0 Novice , 1 Archer , 2 Swordman , 3 Mage
    private int exp; // ระบบ exp สำหรับ uplevel ตัวละคร

    /* Constructor */
    public Character() {
    }

    public Character(String name, int level, int Hp, int characterType, int job, int exp) {
        this.name = name;
        this.level = level;
        this.Hp = Hp;
        this.characterType = characterType;
        this.job = job;
        this.exp = exp;
    }
    /* end Constructor */

    /* attack เป็น abstract character ทุกชนิด มีการโจมตี 
    โดยจะรับ object character ที่จะโจมตี และสกิลที่จะใช้ */
    public abstract void attack(Character character,int i);
    
    /* setter / getter */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return Hp;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
    public int getCharacterType() {
        return characterType;
    }
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }
    public int getJob() {
        return job;
    }
    public void setJob(int job) {
        this.job = job;
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }   
    /* end setter / getter */
    
    
    /* แปลงเลข ชนิด character เป็น String */
    public String convertType(int type){
        /* โดยสร้างตัวแปร String 1 ตัวเพื่อคอยเก็บค่า
        เมื่อ ชนิดเข้า case ไหน ก็จะแปลงค่าในตัวแปร String
        เป็นค่านั้น และ return ค่าออกไปเป็น String */
        String nameType="";
        switch(type){
            /* ในที่นี้ให้ 
            0 = NPC
            1 = Player
            2 = Monster
            3 = Boss    
            อื่นๆ คือ Unknown */
            case(0):nameType="NPC";break;
            case(1):nameType="Player";break;
            case(2):nameType="Monster";break;
            case(3):nameType="Boss";break;
            default:nameType="unknown";break;
        }
        return nameType;
    }
    /* Method ใหม่ สร้างเพื่อให้คลาส 
    Player สามารถอัพคลาส2ได้ */
    public abstract void changeClass();
    
    /* to String */
    @Override
    public String toString() {
        return "Character Info\n" + "Name : " + this.name + "\nLevel : " + 
                level + "\nHP : " + this.Hp  +"\nType : " +
                convertType(characterType);
    }

}
    