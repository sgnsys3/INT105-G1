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
public class Skill {
    private int job; // 0 Novice , 1 Archer , 2 Swordman , 3 Mage
    private String name[];
    private int damage[];

    public Skill() {
    }

    public Skill(int job, String[] name, int[] damage) {
        this.job = job;
        this.name = name;
        this.damage = damage;
    }

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
