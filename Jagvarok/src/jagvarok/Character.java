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
abstract class Character {
    private String name;
    private int level;
    private int Hp; // Hit Point
    private int characterType; // 0 NPC , 1 Player , 2 Monster , 3 Boss
    private int job; // 0 Novice , 1 Archer , 2 Swordman , 3 Mage
    private int exp;

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
        return "Character Info\n" + "Name : " + this.name + "\nLevel : " + level + "\nHP : " + this.Hp + "\nType : " + convertType(characterType) + "\nJob : " + convertJob(job);
    }

    public abstract void attack(Character character,int i);
    
    
}
