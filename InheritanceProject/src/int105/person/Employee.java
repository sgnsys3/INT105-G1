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
        //super(); ไปเรียกในบรรพบุรุษสูงสุดก่อนคือ person
        System.out.println("Employee constructor is working !!!");
    }
    public Employee(long id, String n, String sn, double sal, String pos){
        super(id,n,sn);
        salary=sal;
        position=pos;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
    
}
