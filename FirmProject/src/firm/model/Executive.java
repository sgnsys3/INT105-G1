/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firm.model;

/**
 *
 * @author User
 */
public class Executive extends PayStaff {
    private double bonus;

    public Executive() {
    }

    public Executive( String name, String surname, double payRate, double bonus) {
        super(name, surname, payRate);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double pay(){
        return super.pay()+bonus;
    }
    @Override
    public String toString() {
        return super.toString()+ ", bonus=" + bonus;
    }

  
    
    
}
