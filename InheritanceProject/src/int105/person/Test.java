/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.person;

import int105.student.Student;
/**
 *
 * @author INT105
 */
public class Test {
    public static void main(String[] args) {
//        Person p1 = new Person("Pacharapol","Apitanapat",111111);
//        Person p2 = new Person("C","C",22222222);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p1.equals(p2));
//        Employee e1 = new Employee();
        
        HourlyEmployee e1 = new HourlyEmployee("Pacharapol","Apitanapat",111111,300,"Manager",100);
        System.out.println(e1);
        System.out.println(e1.getRatePerHour());
        
        Student s1 = new Student("Pacharapol","Apitanapat",111111,"KMUTT");
        s1.gotoSchool();
        System.out.println(s1);
    }
}
