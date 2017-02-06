package sit105.view;

import sit105.model.*;
public class TestFirm {
    public static void main(String[] args) {
        Staff[] allStaff = new Staff[4];
        allStaff[0] = new Volunteer("Tae","Keerati","Jearjindarat");
        allStaff[1] = new PayStaff(500000,"Kantarat","Buakhee");
        allStaff[2] = new HourlyStaff(120, 50,"Tiw","Tissadee");
        allStaff[3] = new Executive(300000,1500000,"Keerati","Jearjindarat");
        
        Firm sitFirm = new Firm("SIT Comp.", allStaff);
        System.out.println(sitFirm);
        System.out.println("Total : "+sitFirm.payMothlyAll());
        
//        System.out.println(allStaff[0].getStaffId());
    }
}
