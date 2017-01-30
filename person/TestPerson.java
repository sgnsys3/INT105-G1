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
public class TestPerson {
    public static void main(String[] args) {
        Person p1=new Person(123456789,"kittaphun","bh");
        HourlyEmployee e1=new HourlyEmployee(123456789,"krittaphun","poom",10000,"student",300);
        System.out.println(e1.toString());
        System.out.println(e1.getRatePerHour());
    }
}
