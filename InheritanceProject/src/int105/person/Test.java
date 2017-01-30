/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.person;
import int105.person.*;
import int105.student.*;
/**
 *
 * @author INT105
 */
public class Test {
    public static void main(String[] args){
        //Person p1 =new Person(123456789,"Pratumwan","Ketbunjong");
        //System.out.println(p1);
        //Employee e1 = new Employee();
        HourlyEmployee h1 = new HourlyEmployee(123456789,"Pratumwan","Ketbunjong",10000,"board",200);
        System.out.println(h1);
        System.out.println(h1.getRatePerHour());
        
        Student s1 = new Student(20,123456789,"Pratumwan","Ketbunjong");
        s1.myAge();
        System.out.println(s1);
    }

}
