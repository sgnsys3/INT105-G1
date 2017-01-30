/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.person;

/**
 *
 * @author INT105
 */
public class HourlyEmployee extends Employee{
    private double ratePerHour;
    
    public HourlyEmployee(String name,String surname,long id,double salary,String position,double ratePerHour){
        super(name,surname,id,salary,position);
        this.ratePerHour = ratePerHour;
    }
    public HourlyEmployee(){
        System.out.println("HourlyEmployee constructor is working !!");
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return super.toString()+" HourlyEmployee{" + "ratePerHour=" + ratePerHour + '}';
    }
}
