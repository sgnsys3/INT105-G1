package company;

public class TestCompany {
    public static void main(String[] args) {
        /*Address a1=new Address("126", "Pracha-U-thid", "Bangkok", "10140"); //Component Object
        Company c1=new Company("KMUTT", a1); //Container Object
        System.out.println(c1);
        //=====================
        Address a2=new Address("111", "Ratchadapisak", "Bangkok", "10600"); 
        c1.setCompAddr(a2);
        (c1.getCompAddr()).setStreet("Ratchadapisak26");
        (c1.getCompAddr()).setZipcode("10160");
        System.out.println(c1);
        //=====================
        Company c2=new Company("SIT", a1);
        System.out.println(c2);
        //===================== */
        
        /*Address a1=new Address("126", "Pracha-U-thid", "Bangkok", "10140");
        Address a2=new Address("111", "Ratchadapisak", "Bangkok", "10600");
        Address a3=new Address("111-111", "Ratchadapisak111", "Bangkok111", "10600-111");
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a3));
        
        Address a[] = {a1,a2};
        Company c1 = new Company("KMUTT",a);
        c1.replaceAddress(a2,a3);
        System.out.println(c1);*/
        Building b1 = new Building("SIT",10);
        System.out.println(b1);
        Building b2 = new Building("SIT",10);
        System.out.println(b2);
        
        System.out.println(b1.equals(b2));
    }
} 
