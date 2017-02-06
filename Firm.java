package sit105.model;

public class Firm {
    private String firmName;
    private Staff[] staffs;

    public Firm() {
    }

    public Firm(String firmName, Staff[] staffs) {
        this.firmName = firmName;
        this.staffs = staffs;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public Staff[] getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
        String result = firmName+"\n";
        for(Staff staff : staffs){
            result += staff;
        }
        return "Firm{" + "firmName=" + firmName + ", staffs=" + result + '}';
    }
    
    public double payMothlyAll(){
        double totalPay=0;
        for(int i = 0; i<=staffs.length-1; i++){
            totalPay+=staffs[i].pay();
        }        
        return totalPay;
    }
}
