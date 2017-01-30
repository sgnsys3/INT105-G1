package Person;

import Student.*;
public class TestPerson {
    public static void main(String[] args) {
//        Person p1 = new Person("Keerati","Jearjindarat",123456789);
//        Person p2 = new Person("Keerati","Jearjindarat",123456789);
        
//        System.out.println(p1.equals(p2));

//          Employee e1 = new Employee();
//        HourlyEmployee he1 = new HourlyEmployee(158496.1,59410.15,"Lukjang","Keerati","Jearjindarat",123456);
//        System.out.println(he1);
//        System.out.println(he1.getRatePerHour());
        Student std1 = new Student(3.62,"Keerati","Jearjindarat",1100801256094l);
        std1.checkStatus();
        Student std2 = new Student(3.06,"Kantarat","Bhuakhee",1105123519120l);
        std2.checkStatus();
        Student std3 = new Student(1.4,"Tisadee","Tavornsdasad",1231561561812l);
        std3.checkStatus();
    }
}
