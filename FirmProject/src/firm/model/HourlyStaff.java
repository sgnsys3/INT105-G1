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
public class HourlyStaff extends PayStaff {
    private double workHour;

    public HourlyStaff() {
    }

    public HourlyStaff(String name, String surname, double payRate, double workHour) {
        super(name, surname, payRate);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public String toString() {
        return super.toString()+ ", workHour=" + workHour ;
    }
    
    
}
