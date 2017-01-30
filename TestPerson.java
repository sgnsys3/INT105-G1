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
import int105.student.Student;
public class TestPerson {
    public static void main(String[] args) {
//        Person p1 = new Person(59135000015l,."Chanapa","Choowisetvanit");
//        System.out.println(p1);

//        HourlyEmployee e1 = new HourlyEmployee(1100702619369l,"Chanapa","Choowisetvanit",9000,"Student",90);
//        System.out.println(e1);
//        System.out.println(e1.getRatePerHour());
          Student std = new Student(59130500015l,1100741849684l,"Chanapa","Choowisetvanit");
          System.out.println(std.showStudentCard());
          std.studentRename("Kunnunya");
          System.out.println(std.showStudentCard());
          
          Student std2 = new Student();
          System.out.println(std2.showStudentCard());
          
    }
}
