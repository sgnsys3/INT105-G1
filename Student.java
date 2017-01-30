package int105.student;
import int105.person.*;
public class Student extends Person{
    long stuId;
    String stuName;
    String stuSurname;
    
//    public void print() {
//    }
    
        
    public Student(long cardId, String name, String surname,String blood) {
        super(cardId,name,surname);
        this.stuId = cardId;
        this.stuName=name;
        this.stuSurname=surname;
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSurname() {
        return stuSurname;
    }

    public void setStuSurname(String stuSurname) {
        this.stuSurname = stuSurname;
    }
    
    
    
    @Override
    public String toString() {
        return "Student : "+ "\n"+ 
                "Student ID :" + stuId +  "\n"+ 
                "Name : " + stuName +  "\t"+ stuSurname;
    }
    
    

    

    
    
}
