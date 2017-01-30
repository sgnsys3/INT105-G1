package Person;

public class HourlyEmployee extends Employee {
    public double ratePerHour;

    public HourlyEmployee() {
//        System.out.println("Hourly Ma same same");
    }

    public HourlyEmployee(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour, double salary, String position) {
        super(salary, position);
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(double ratePerHour, double salary, String position, String name, String surname, long cardId) {
        super(salary, position, name, surname, cardId);
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    @Override
    public String toString() {
        return super.toString()+"HourlyEmployee{" + "ratePerHour=" + ratePerHour + '}';
    }
}
