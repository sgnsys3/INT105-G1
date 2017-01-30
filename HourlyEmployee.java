/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author INT105
 */
public class HourlyEmployee extends Employee {

    private double ratePerHour;

    public HourlyEmployee() {
        super();
        System.out.println("HourlyEmployee constructor is working it");
    }

    public HourlyEmployee(double ratePerHour, double salary, String position, String name, long cardId, String surname) {
        super(salary, position, name, cardId, surname);
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour, double salary, String position) {
        super(salary, position);
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour, double salary, String position, long cardId) {
        super(salary, position, cardId);
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour, double salary, String position, String name) {
        super(salary, position, name);
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return super.toString() + "HourlyEmployee{" + "ratePerHour=" + ratePerHour + '}';
    }

}
