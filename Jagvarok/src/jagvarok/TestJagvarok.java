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
        
        String name2[] = {"Slash","Blowing Bash","Ultimate Sword"};
        int damage2[] = {30,70,500};
        Skill swordman = new Skill(name2,damage2);
        
        String monsterSkill[] = {"Stomp","Super Poring"};
        int damageMon[] = {10,99999};
        Skill poring  = new Skill(monsterSkill,damageMon);
        
        /* สร้าง object Player , NPC , Monster */
        /* Player นี้ อาชีพ Archer จากที่ set ค่าไว้ */
        /* Status Player
         * Name : Prayood
         * Level : 1
         * HP : 100
         * Type : Player
         * Job : Archer
         * Skill :  Name , Shoot , Super Shot , Ultimate Arrow 
	 * Damage  , 10 , 100 , 500 */
        Character Player1 = new Player("Prayood",1,100,1,1,0,archer);
         // Constuctor = name , lvl , Hp , characterType , job , exp , Skillset
         
        /* NPC */
        /* Status NPC 
         * Name : Alpaka
         * Level : 99
         * HP : 1000 */
        Character Npc = new Npc("Alpaka",1,90,1,1);
        
        /* Monster */
        /*Status Monster 
         * Name : Poring
         * HP : 100
         * Skill :  Name , Stomp , Super Poring 
	 * Damage  , 10 , 99999 */
        Character Monster = new Monster("Poring",2,100,1,10,poring);
        
        /* แสดง ข้อมูลของ Character ต่างๆ */
        System.out.println(Player1);
        System.out.println(Monster);
        System.out.println(Npc);
        
        /* สั่งให้ monster โจมตี Player 1 ด้วยสกิล 1 (ช่องสกิล 0) */
        Monster.attack(Player1, 0);
        
        /* แสดง สเตตัส ปัจจุบัน ของ character */
        System.out.println(Player1);
        System.out.println(Monster);
        
        /* สั่งให้ Player โจมตี Monster ด้วยสกิล 1 (ช่องสกิล 0 )*/
        Player1.attack(Monster, 0);
        /* ทดสอบ ให้ Player ทำร้ายตัวเอง */
        Player1.attack(Player1, 0);
        
        /* แสดง สเตตัส ล่าสุด */
        System.out.println(Player1);
        System.out.println(Monster);
        
        /* Monster โจมตี Player ดว้ยดาเมจ 99999*/
        Monster.attack(Player1, 1);
        /* Player ตายแล้ว */
        
        /* แสดง สเตตัส ล่าสุด */
        System.out.println(Player1);
        System.out.println(Monster);
        
        /* ทดสอบ Player ตายแล้ว โจมตีไม่ได้ */
        Player1.attack(Monster, 2);
    }
    
}
