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

    public Employee() {
        //super();
        
    }

    public Employee(long cardId, String name, String surname,double salary, String position) {
        super(cardId, name, surname);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    

    @Override
    public String toString() {
        
        return super.toString()+"Employee{" + "salary=" + salary + ", position=" + position + '}'+"\n";
    }
    
   
   
}
