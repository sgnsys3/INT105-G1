package jagvarok;

/**
 *
 * @author Imagine
 */
public class TestJagvarok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* สร้าง Arrays เก็บชื่อของสกิล และ ดาเมจสกิล 
        แล้วนำไปใส่ใน object สกิลของ อาชีพนั้นๆ 
        ในที่นี้สร้าง 2 อาชีพคือ archer และ swordman */
        String name[] = {"Shoot","Super Shot","Ultimate Arrow"};
        int damage[] = {10,100,500};
        Skill archer = new Skill(name,damage);
        String bossSkill[] = {"Stomp","Super Poring"};
        int damageBoss[] = {2500,10000};
        Skill behemot  = new Skill(bossSkill,damageBoss);
        
        /* สร้าง object Player , NPC , Monster */
        /* Player นี้ อาชีพ Archer จากที่ set ค่าไว้ */
        /* Status Player
         * Name : Prayood ,Level : 1, HP : 100
         * Type : Player ,Job : Archer
         * Skill :  Name , Shoot , Super Shot , Ultimate Arrow 
	 * Damage  , 10 , 100 , 500 */
        Character Player1 = new Player("Prayood",1,100,1,1,0,archer);
         // Constuctor = name , lvl , Hp , characterType , job , exp , Skillset
        
        /* Monster */
        /* Status Monster 
         * Name : Poring
         * HP : 100
         * Skill :  Name , Stomp , Super Poring 
	 * Damage  , 10 , 99999 */
        Character Boss = new Monster("Behemot",10,100,3,500,behemot);
        
        /* แสดง ข้อมูลของ Character ต่างๆ */
        System.out.println(Player1);
        System.out.println(Boss);
        
        /* วนลูปให้ Player เก็บเลเวลเพื่อ 
        เทส คลาสและฉายา */
        for (int i = 0; i < 25; i++) {
            Player1.attack(Boss, 2);
        }
        /* ทดสอบ เปลี่ยนคลาส 2 */
        Player1.changeClass();
        
        /* แสดงการเปลี่ยนคลาส */
        System.out.println(Player1);
        System.out.println(Boss);
    }
    
}
