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

    public Monster() {
    }

    public Monster(String name, int level, int Hp, int characterType, int job, int exp, Skill skillSet) {
        super(name, level, Hp, characterType, job, exp);
        this.skillSet = skillSet;
    }


    
}
