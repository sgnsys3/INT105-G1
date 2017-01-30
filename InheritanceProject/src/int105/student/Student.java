/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.student;
import int105.person.*;
/**
 *
 * @author INT105
 */
//public class Student extends Person{ //extend person
//    public void print(){ 
//        System.out.println(cardId);
//    }
//}
// public class Student{
//     public void print(){
//         Person p = new Person();
//         System.out.println(p.cardId); //เปลี่ยนcardIdตรงpersonจากprotecเป็นpublic
//     }
// }
public class Student extends Person{
    private int age;

    public Student(int age, long cardId, String name, String surname) {
        super(cardId, name, surname);
        this.age = age;
    }
    
    public void myAge(){
        System.out.println("My Age : "+age);
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "age=" + age + '}';
    }
 
}
    

