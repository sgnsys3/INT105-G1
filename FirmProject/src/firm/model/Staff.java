/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firm.model;

/**
 *
 * @author User
 */
public abstract class Staff implements Comparable<Staff>{
    protected static long seqNo=1000;
    private long staffId;
    private String name;
    private String surname;

    public Staff(String name, String surname) {
        this.staffId = ++seqNo;
        this.name = name;
        this.surname = surname;
    }

    public Staff() {
        this("unknown", "unknown");
    }

    public static long getSeqNo() {
        return seqNo;
    }

    
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    public abstract double pay();

    @Override
    public String toString() {
        return "staff Id=" + staffId + ", name=" + name + ", surname=" + surname;
    }
    
    public int compareTo(Staff s){
        //return (int)(staffId-s.staffId);
        if(name.compareTo(s.name)==0)
            if(surname.compareTo(s.surname)==0)
                return 0;
            else
                return surname.compareTo(s.surname);
        else
            return name.compareTo(s.name);
    }   
    
}
