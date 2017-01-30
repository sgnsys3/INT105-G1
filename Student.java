package Student;

import Person.*;
public class Student extends Person {
    private double GPA;
    private String status;

    public Student(double GPA) {
        this.GPA = GPA;
    }

    public Student(double GPA, String name, String surname, long cardId) {
        super(name, surname, cardId);
        this.GPA = GPA;
    }
    
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void checkStatus(){
        int i=(int)(Math.random()*2);
        String[] Hello ={"Hello","Hi"};
        if(this.GPA<=1.49)
            this.status="You're not Student in University.";
        else
            this.status="You're Student in University.";
        if(this.GPA>3.5)
            this.status="You're Best Student! :)";
        System.out.println("\t "+Hello[i]+" "+getName()+" "+getSurname()+"!\nYour Card ID : "
                            +getCardId()+"\nYour GPAX : "+this.GPA+"\nStatus : "+this.status+"\n");
    }
    
    @Override
    public String toString() {
        return super.toString()+"Student{" + "GPA=" + GPA + '}';
    }
    
    
}
