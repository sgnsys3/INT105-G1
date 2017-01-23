/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg59130500070pu;

/**
 *
 * @author INT105
 */
public class Address { //component object
    private String homeId;
    private String nameHome;
    private int numberId;
    
    public Address(){
        
    }

    public Address(String homeId, String nameHome, int numberId) {
        this.homeId = homeId;
        this.nameHome = nameHome;
        this.numberId = numberId;
    }

    public String getHomeId() {
        return homeId;
    }

    public String getNameHome() {
        return nameHome;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public void setNameHome(String nameHome) {
        this.nameHome = nameHome;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    @Override
    public String toString() {
        return "Address{" + "homeId=" + homeId + ", nameHome=" + nameHome + ", numberId=" + numberId + '}';
    }
    
    
}
