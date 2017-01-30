/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.student;

import int105.person.HourlyEmployee;
import int105.person.Person;

/**
 *
 * @author INT105
 */
public class Student extends Person{
    private int intelligence;
    public void learn(){
        intelligence+=1;
    }
    public String status(){
        String result="";
        switch(intelligence){
            case 0:result="dumb";break;
            case 1:result="normal";break;
            case 2:result="smart";break;
            case 3:result="clever";break;
            case 4:result="very clever";break;
            case 5:result="crazy";break;
        }
        return result;
    }

    public Student(int intelligence, long cardId, String name, String surname) {
        super(cardId, name, surname);
        this.intelligence = intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Student{" + "intelligence=" + intelligence + '}';
    }
    
    public static void main(String[] argsS) {
//        HourlyEmployee he=new HourlyEmployee(123456789,"krittaphun","poom",10000,"student",300);
//        Person ps=new Person();
//        System.out.println(ps.cardId);
    }
}
