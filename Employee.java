package int105;
public class Employee extends Person {
    private double salary;
    private String position;
    
    public Employee(){
        //super();
        System.out.println("Employee constructor is working !!!");
    }
    
    public Employee(String name,String surname,long cardId,double salary,String position) {
        super(name,surname,cardId);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
}
