package sit105.model;

public class Volunteer extends Staff {
    private String staffId; 
    //staffId shadowing form Staff class
    private String EmergencyContactName;

    public Volunteer() {
        //super();
    }

    public Volunteer(String EmergencyContactName, String name, String surname) {
        super(name, surname);
        this.staffId="Vol-"+(getSeqNo());
        this.EmergencyContactName = EmergencyContactName;
    }
    
    //implement abstact method pay();
    public double pay(){
        return 0;
    }

    @Override
    public String toString() {
        return "\nstaffId= " + staffId + ", name= " + getName() + ", surname= " + getSurname() 
                + ", EmergencyContactName= " + EmergencyContactName;
    }
    
}
