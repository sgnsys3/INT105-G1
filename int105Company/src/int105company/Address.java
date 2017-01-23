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
public class Address {
    private String no;
    private String street;
    private String province;
    private String zipCode;
    
    public Address(){
        this.no = "";
        this.street = "";
        this.province = "";
        this.zipCode = "";
    }
    
    public Address(String no, String street, String province, String zipCode) {
        this.no = no;
        this.street = street;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getNo() {
        return no;
    }

    public String getStreet() {
        return street;
    }

    public String getProvince() {
        return province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "no=" + no + ", street=" + street + ", province=" + province + ", zipCode=" + zipCode+"}\n";
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        Address addrPa = (Address)obj;
        //Address addrPa = obj;
        if(obj instanceof Address){
            if(no.equals(addrPa.getNo()) && street.equals(addrPa.getStreet()) && province.equals(addrPa.getProvince()) && zipCode.equals(addrPa.getZipCode())){
                result = true;
            }
        }
        
        return result;
    }
    
}
