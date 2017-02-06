/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firm.model;

import java.util.Iterator;

/**
 *
 * @author User
 */
public class Firm implements Iterator<Staff>, Report{
    private int index=-1;
    private String firmName;
    private Staff staffs[];
    private String firmHeader;
 
    
    public Firm(String firm, Staff[] staffs) {
        firmName=firm;
        this.staffs = staffs;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public Staff[] getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
     
       String result=firmName+"\n";
       for(int i=0;i<staffs.length;i++){
           result+=staffs[i]+"\n";
       }
       return result;
    }
    
    public boolean hasNext(){
        return index<staffs.length-1;
    }
    
    public Staff next(){
        index++;
        return staffs[index];
    }
    
    public void remove(){}
    
    public boolean searchStaff(Staff someOne){
        int i;
        for(i=0;i<staffs.length;i++){
             if(staffs[i].compareTo(someOne)==0){
                 return true;
             }
        }
        return false;
    }
    
    public void sortStaffByID(){
      
        for(int i=0;i<staffs.length;i++){
            int minIndex=i;
            for(int j=i+1;j<staffs.length;j++){
                if(staffs[j].compareTo(staffs[minIndex])<0)
                    minIndex=j;
            }
            if(i!=minIndex){
              Staff tmp=staffs[i];
              staffs[i]=staffs[minIndex];
              staffs[minIndex]=tmp;
            }
        }
    }
   
    public String getHeader(){
        return firmHeader;
    }
    public void setHeader(String header){
       firmHeader=header;
    }
    
    public double allPay(){
        double totalPay=0;
        for(int i=0;i<staffs.length;i++){
            totalPay+=staffs[i].pay();
            System.out.println(staffs[i]);
        }
        return totalPay;
    }
}
