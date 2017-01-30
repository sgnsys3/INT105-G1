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
public class Employee extends Person{
    private double salary;
    private String position;
    
    public Employee(){
        System.out.println("Employee constructor is working !!");
    }
    public Employee(String name,String surname,long id,double salary,String position){
        super(name,surname,id);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+" Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
}