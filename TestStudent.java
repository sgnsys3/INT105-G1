/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INT105.Student;

/**
 *
 * @author JIL
 */
public class TestStudent {
    public static void main(String[] args){
        Student st = new Student("59130500012", 1149900502334l, "Jirapa", "Songchom");
        System.out.println(st.stdIdChecking());
    }
}
