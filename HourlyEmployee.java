package int105;
public class HourlyEmployee extends Employee{
    private double ratePerHour;

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(){
        System.out.println("HoulryEmployee constructor is working !!!");
    }
    
    public HourlyEmployee(String name,String surname,long cardId,double salary,String position,double ratePerHour){
        super(name,surname,cardId,salary,position);
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String toString() {
        return super.toString()+"HourlyEmployee{" + "ratePerHour=" + ratePerHour + '}';
    }
       
}
