package int105.other;
import int105.*;

public class Student extends Person {
    private double score;
    private String grade;

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public Student(){
       
    }
    
    public Student(String name,String surname,long cardId,double score){
        super(name,surname,cardId);
        this.score = score;
        this.grade = CalGrade();
    }
    
    public String CalGrade(){
        String grade = "";
        double input = this.score;
        if(input>80)
            grade = "A";
        else if(input>=60 & input<=80)
            grade = "B";
        else if(input>=50 & input<60)
            grade = "C";
        else if(input<50)
            grade = "F";
        return grade;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStudent{" + "score=" + score + ", grade=" + grade + '}'+"\n";
    }
    
}
