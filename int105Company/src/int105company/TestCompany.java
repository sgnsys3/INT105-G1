/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105company;

/**
 *
 * @author INT105
 */
public class TestCompany {

    public static void main(String[] args) {
//        Address a1 = new Address("126", "Pracha-U-thid", "Bangkok", "10140");
//        Address a2 = new Address("56", "Kanchanaphisek", "Bangkok", "10150");
//        Address a3 = new Address("555","Petkasem","Bangkok","00000");
//        Address[] a = {a1, a2};
//        
//        Company c1 = new Company("BIG", a, "John");
//        Company c2 = new Company("SIT",a,"Eiei");
//        
//        System.out.println(a1.equals(a2));
//        
//        c1.changeAddress(a1,a3);
//
//        System.out.println(c1);
        Building b1 = new Building("SIT",10);
        System.out.println(b1);
        Building b2 = new Building("SIT",10);
        System.out.println(b2);
        
        System.out.println(b1.equals(b2));
    }
}
