package Person;

public class Employee extends Person {
    private double salary;
    private String position;

    public Employee() {
//        System.out.println("Employee Gor ma na ja");
    }

    public Employee(double salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public Employee(double salary, String position, String name, String surname, long cardId) {
        super(name, surname, cardId);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "salary=" + salary + ", position=" + position + '}';
    }
}
