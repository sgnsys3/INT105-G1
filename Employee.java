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
public class Employee extends Person {
    private double salary;
    private String position;

    public Employee(double salary, String position, String name, long cardId, String surname) {
        super(name, cardId, surname);
        this.salary = salary;
        this.position = position;
    }

    public Employee(double salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public Employee(double salary, String position, long cardId) {
        super(cardId);
        this.salary = salary;
        this.position = position;
    }

    public Employee(double salary, String position, String name) {
        super(name);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
    
    public Employee(){
        System.out.println("Employee constructor is working it");
    }
    
}
