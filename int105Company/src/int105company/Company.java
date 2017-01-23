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
public class Company { //Aggregate Object, Container Object
    private String name; //component object
    private Address[] address; //component object
    private String ownerName;

    public Company() {
        this.name = "";
        this.address = null;
        this.ownerName = "";
    }
    
    public Company(String name, Address[] address, String ownerName) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public Address[] getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void changeAddress(Address addr1,Address addr2){
        for(int i = 0;i<address.length;i++){
            if(addr1.equals(address[i])){
                address[i] = addr2;
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        String output="";
        for(Address str : address){
            output += str;
        }
        return "Company{" + "name=" + name + ", address=" + output + ", ownerName=" + ownerName + '}';
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        Company comp = (Company)obj;
        if(obj instanceof Company){
            if(name.equals(comp.name)){
                result = true;
            }
        }
        return result;
    }

    
}
