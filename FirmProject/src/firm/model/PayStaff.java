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
public class PayStaff extends Staff {
    private double payRate;

    public PayStaff(String name, String surname, double payRate) {
        super(name, surname);
        this.payRate = payRate;
    }

    public PayStaff() {
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double pay(){
        return payRate;
    }
    @Override
    public String toString() {
        return super.toString()+ ", payRate=" + payRate;
    }

   
    
}
