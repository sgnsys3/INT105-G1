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

    public Player() {
    }

    public Player(String name, int level, int Hp, int characterType, int job, int exp, Skill skillSet) {
        super(name, level, Hp, characterType, job, exp);
        if(characterType!=0){
            characterType=0;
        }
        if(level>1||level<=1){
            level=1;
        }
        if(exp>0||level<=0){
            level=0;
        }
        this.skillSet = skillSet;
    }



    @Override
    public String toString() {
        return super.toString()+"\nSkill : " + skillSet;
    }
    
    
}
