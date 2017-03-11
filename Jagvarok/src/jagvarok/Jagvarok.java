/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jagvarok;

/**
 *
 * @author Imagine
 */
public class Jagvarok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name[] = {"Shoot","Super Shot","Ultimate Arrow"};
        int damage[] = {10,100,500};
        Skill archer = new Skill(1,name,damage);
        String name2[] = {"Slash","Blowing Bash","Ultimate Sword"};
        int damage2[] = {30,70,500};
        Skill swordman = new Skill(1,name2,damage2);
        String monsterSkill[] = {"Stomp"};
        
        Character Player1 = new Player("Prayood",1,100,1,1,0,archer);
        Character Player2 = new Player("Pratara",1,100,1,2,0,swordman); // name , lvl , Hp , characterType , job , exp , Skillset
        
        Character Npc = new Npc();
        Character Monster = new Monster();
        
        System.out.println("=================="); 
        System.out.println(Player1);
        System.out.println("==================");
        System.out.println(Player2);
    }
    
}
