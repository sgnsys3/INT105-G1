package sit105.model;

public class Executive extends PayStaff {
    private float bonus;

    public Executive() {
    }

    public Executive(float bonus, double payRate, String name, String surname) {
        super(payRate, name, surname);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +  ", bonus= " + bonus ;
    }
    
    public double pay(){
        return getPayRate()+bonus;
    }
}
