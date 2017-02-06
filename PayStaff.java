package sit105.model;

public class PayStaff extends Staff{
    private double payRate;
    

    public PayStaff() {
    }

    public PayStaff(double payRate, String name, String surname) {
        super(name, surname);
        this.payRate = payRate;
    }
    
    public double pay(){
        return payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", payRate= " + payRate;
    }

    
}
