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
public class TestJagvarok {

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
        String monsterSkill[] = {"Stomp","Super Poring"};
        int damageMon[] = {10,99999};
        Skill poring  = new Skill(1,monsterSkill,damageMon);
        
        Character Player1 = new Player("Prayood",1,100,1,1,0,archer); // name , lvl , Hp , characterType , job , exp , Skillset
        Character Player2 = new Player("Pratara",1,100,1,2,0,swordman);
        
        Character Npc = new Npc();
        Character Monster = new Monster("Poring",2,100,1,10,poring);
        
        
        System.out.println(Player1);
        System.out.println(Monster);
        
        Monster.attack(Player1, 0);
        
        System.out.println(Player1);
        System.out.println(Monster);
        
        Player1.attack(Monster, 0);
        
        System.out.println(Player1);
        System.out.println(Monster);
        
        Monster.attack(Player1, 1);
        
        System.out.println(Player1);
        System.out.println(Monster);
        
        Player1.attack(Monster, 2);
        
        System.out.println(Player1);
        System.out.println(Monster);
        
    }
    
}
