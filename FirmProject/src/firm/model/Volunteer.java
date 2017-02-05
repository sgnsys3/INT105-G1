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
public class Volunteer extends Staff {
    private String staffId;
    private String EmergencyContactName;


    public Volunteer() {
    }

    public Volunteer(String name, String surname, String EmergencyContactName) {
        super(name, surname);
        staffId="Vol-"+seqNo;
        this.EmergencyContactName = EmergencyContactName;
    }

    public String getEmergencyContactName() {
        return EmergencyContactName;
    }
 

    public void setEmergencyContactName(String EmergencyContactName) {
        this.EmergencyContactName = EmergencyContactName;
    }

    public double pay(){
        return 0;
    }

    @Override
    public String toString() {
        return "Staff Id= "+staffId+", Name="+getName()+", Surname="+getSurname()+", Emergency Contact Name=" + EmergencyContactName;
    }
    
   
    
    
}
