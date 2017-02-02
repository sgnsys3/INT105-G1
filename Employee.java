/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT105.Person;

/**
 *
 * @author INT105
 */
public class Employee extends Person {
    private double salary;
    private String position;

    public Employee() {
        //super(); auto add 
        System.out.println("Employee constructor is working!!");
    }

    public Employee(long cardId,String position, String name,double salary, String surname) {
        super(cardId, name, surname);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
    
    
    
    
    
}
