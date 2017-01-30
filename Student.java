/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import inheritance1.Person;

/**
 *
 * @author INT105
 */
public class Student extends Person {
    protected int old;
    protected String level;

    public Student(int old, String name, long cardId, String surname) {
        super(name, cardId, surname);
        this.old = old;
    
    }

    public String checkLevel(){
        
        switch (old) {
            case 1:
                level = "Beginner";
                break;
            case 2:
                level = "Professional";
                break;
            default:
                level = "Congratulation";
                break;
        }
    return level+super.toString();
    }
    
}
