package kmutt.sit.int105;
public class Address {
    private String no;
    private String street;
    private String province;
    private String zipCode;
 
    public Address(){
    
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

    public void setNo(String no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address:" + " no." + no + " street = " + street + " province = " + province + " zipCode = " + zipCode;
    }
    
    public boolean equals(Object obj){
        boolean result=false;
        if(obj instanceof Address){
            Address addrPa = (Address)obj;
            if(no.equals(addrPa.no)&&
                    street.equals(addrPa.street)&&
                    province.equals(addrPa.province)&&
                    zipCode.equals(addrPa.zipCode))
                    result = true;
                    
        }
        
        return result;
    }
}
