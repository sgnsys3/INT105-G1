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
public class Player extends Character{
    Skill skillSet;
    private String name;
    private int level;
    private int Hp; // Hit Point
    private int characterType; // 0 NPC , 1 Player , 2 Monster , 3 Boss
    private int job; // 0 Novice , 1 Archer , 2 Swordman , 3 Mage
    private int exp;

    public Player() {
    }

    public Player(String name, int level, int Hp, int characterType, int job, int exp, Skill skillSet) {
        this.name = name;
        if(characterType!=0){
            this.characterType=0;
        }
        if(level>1||level<=1){
            this.level=1;
        }
        if(exp>0||exp<0){
            this.exp=0;
        }
        this.Hp = Hp;
        this.characterType = characterType;
        this.job = job;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Character mon,int i){
        if(mon instanceof Monster){
            if(this.Hp!=0){
                System.out.println("<<<<<<"+this.name+" Attack>>>>>>");
                mon.setHp(mon.getHp()-this.skillSet.getDamage(i));
                if(mon.getHp()==0){
                    System.out.println("Monster died.");
                }
            }
            else System.out.println("Can't Attack,You died.");
        }
        else System.out.println("Please attack on Monster");
    }
    public String convertJob(int job){
        String nameJob="";
        switch(job){
            case(0):nameJob="Novice";break;
            case(1):nameJob="Archer";break;
            case(2):nameJob="Swordman";break;
            case(3):nameJob="Mage";break;
            default:nameJob="Unknown";break;
        }
        return nameJob;
    }
    
    public String convertType(int type){
        String nameType="";
        switch(type){
            case(0):nameType="NPC";break;
            case(1):nameType="Player";break;
            case(2):nameType="Monster";break;
            case(3):nameType="Boss";break;
            default:nameType="unknown";break;
        }
        return nameType;
    }
    
    @Override
    public String toString() {
        System.out.println("======================="); 
        return "Character Info\n" + "Name : " + this.name + "\nLevel : " + level + "\nHP : " + this.Hp + "\nType : " + convertType(characterType) + "\nJob : " + convertJob(job) +"\nSkill : " + skillSet;
    }
    
    
}
