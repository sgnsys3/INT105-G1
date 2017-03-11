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
public class Monster extends Character {
    Skill skillSet;
    private int Hp; // Hit Point
    private String name;

    public Monster() {
    }

    public Monster(String name, int level, int Hp, int characterType, int exp, Skill skillSet) {
        super(name, level, Hp, characterType, -1, 20);
        this.name = name;
        this.Hp = Hp;
        this.skillSet = skillSet;
    }

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
    
    public void attack(Character Player,int i){
        if(Player instanceof Character){
            if(this.Hp!=0){
                System.out.println("<<<<<<"+this.name+" Attack>>>>>>");
                Player.setHp(Player.getHp()-this.skillSet.getDamage(i));
                if(Player.getHp()==0){
                    System.out.println("Player died.");
                }
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("======================="); 
        return "Monster Info\n" + "Name : " + this.name + "\nHP : " + this.Hp + "\nSkill : " + skillSet;
    }


    
}
