/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT105.Student;
import INT105.Person.*;
/**
 *
 * @author INT105
 */
public class Student extends Person{
    private String stdId;

    public Student() {
    }

    public Student(String stdId) {
        this.stdId = stdId;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    
    public Student(String stdId, long cardId, String name, String surname) {
        super(cardId, name, surname);
        this.stdId = stdId;
    }
    
    
    public String stdIdChecking(){
        String result="";
        if(stdId.length()==11){
            if(stdId.startsWith("59")){
                result = name+" is Student year 1.";
            }else if(stdId.startsWith("58")){
                result = name+" is Student year 2.";
            }else if(stdId.startsWith("57")){
                result = name+" is Student year 3";
            }else if(stdId.startsWith("56")){
                result = name+" is Student year 4";
            }
        }
        return result;
    }
}

