/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firm.view;

import firm.model.*;


/**
 *
 * @author User
 */
public class TestFirm {
    public static void main(String [] args){
        Staff allStaff[]=new Staff[4];
        allStaff[0]=new Volunteer("Debby","Jung", "Bob");
        allStaff[1]=new Executive("James","Cha",50000, 20000);
        allStaff[2]=new PayStaff("Zanika","Inn",30000);
        allStaff[3]=new HourlyStaff("Ann","Zoo",300, 50);
        
        Firm myFirm=new Firm("SiT Company",allStaff);
       
     //   System.out.println(myFirm);
     
        System.out.println("--------------The Staff List--------------");
        while(myFirm.hasNext()){
            System.out.println(myFirm.next());
        }
        
        Volunteer v1=new Volunteer("Debby", "JungJung","Bob");
        if(myFirm.searchStaff(v1)){
          System.out.println("This person is our staff");
        }
        else{
          System.out.println("This person is not our staff");
        }
        myFirm.sortStaffByID();
        System.out.println("--------------After Sort by staff Id--------------");
        System.out.println(myFirm);
      
        
        myFirm.setHeader("--------Monthly Staff Salary Report-------------");
        System.out.println(myFirm.getHeader());
        System.out.println("Total Pay = "+myFirm.allPay());
        
    }
}
