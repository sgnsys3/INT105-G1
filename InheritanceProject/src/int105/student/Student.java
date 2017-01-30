/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.student;
import int105.person.*;
/**
 *
 * @author INT105
 */
public class Student extends Person{
    private String school;
    
    public Student(String name, String surname, long cardId, String school){
        super(name,surname,cardId);
        this.school = school;
    }
    
    public void gotoSchool(){
        System.out.println("Woooop! You are now at "+school+" !!");
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return super.toString()+" Student{" + "school=" + school + '}';
    }
    
    
}
