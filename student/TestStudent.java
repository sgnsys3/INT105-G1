/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.student;

/**
 *
 * @author INT105
 */
public class TestStudent {
    public static void main(String[] args) {
        Student std=new Student(1,59130500002L,"Krittaphun","Bh");
        std.learn();
        std.learn();
        System.out.println(std.status());
        System.out.println(std);
    }
}
