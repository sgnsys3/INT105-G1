/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tower;

/**
 *
 * @author INT105
 */
public class TestBuilding {

    public static void main(String[] args) {
        Building lx = new Building("LX Building", 20);
        Building lxx = new Building("LX Building", 20);
        lx.buildRoom();
        lxx.buildRoom();
        System.out.println(lx.equals(lxx));
    }
}
