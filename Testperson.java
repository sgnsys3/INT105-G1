/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

import Student.Student;

/**
 *
 * @author INT105
 */
public class Testperson {
    public static void main(String[] args) {
        //Person p1 = new Person("GusGus",591300026,"Yeah");
        //System.out.print(p1);
        Student s1 = new Student(34,"Nattapon",59130500026l,"Roeksriprapa");
        System.out.println(s1.checkLevel());
        /*HourlyEmployee h1= new HourlyEmployee(2500,10000,"Boss","GusGus",54154526,"Gs");
        System.out.println(h1.getRatePerHour());*/
    }
}
