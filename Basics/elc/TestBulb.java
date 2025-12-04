package Basics.elc;

import Basics.blc.Bulb;

public class TestBulb {
    static void main() {
        boolean status = Boolean.parseBoolean(IO.readln("Enter status [On/ Off] : "));

        Bulb bulb = new Bulb();
        bulb.setBulbStatus(status);
        IO.println(bulb.getBulbStatus());
    }
}
