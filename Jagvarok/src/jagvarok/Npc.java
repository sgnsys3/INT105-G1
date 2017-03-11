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
public class Npc extends Character {
    private int typeNpc; // 0 merchant , 1 other

    public Npc() {
    }

    public Npc(String name, int level, int Hp, int characterType, int job, int exp, int typeNpc) {
        super(name, level, Hp, characterType, job, exp);
        this.typeNpc = typeNpc;
    }
    
    
}
