package sit105.model;

abstract public class Staff {
    private long staffId;
    private String name;
    private String surname;
    private static long seqNo=1000;

    public static long getSeqNo() {
        return seqNo;
    }

    public static void setSeqNo(long seqNo) {
        Staff.seqNo = seqNo;
    }
    
    public Staff() {
        this("unknown","unknown");
    }

    public Staff(String name, String surname) {
        this.staffId = ++seqNo;
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "\n" + "staffId= " + staffId + ", name= " + name + ", surname= " + surname;
    }
    
    public abstract double pay(); // abstract method
    
}
