/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.student;

/**
 *
 * @author INT105
 */
import int105.person.*;

public class Student extends Person{

  private long stdId ;

    public Student() {
    }
  
    public Student(long stdId, long cardId, String name, String surname) {
        super(cardId, name, surname);
        this.stdId = stdId;
    }
    
    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + '}';
    }
    public void studentRename(String newName){
        setName(newName);
    }
    public String showStudentCard(){
        String result = "";
        result += "Student ID: "+stdId+"\nName: "+ getName() +"\nSurname: " + getSurname()+"\n";
        return result;
    }
  
    
}
