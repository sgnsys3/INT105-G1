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
   private long stdId;

    public Student(long stdId, long cardId, String name, String surname) {
        super(cardId, name, surname);
        this.stdId = stdId;
    }

    public Student() {
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
   
}
