package com.toturesdude.Association;

import com.toturesdude.Association.Relationship.*;

public class Runner {

    public static void main(String[] args) {


        Computer com = new Computer();

        com.brand ="dell";
        com.keyboard ="black";
        com.monitor=32.5f;
        com.size=256;
        com.noOfSpeakers=2;



        Monitor mon = new Monitor();

        mon.brand = "dell";
        mon.display = "led";
        mon.price = 24000;

        System.out.println(mon.brand);

        Ram r1 = new Ram();

        r1.price = 30000;
        r1.storage=550;

        System.out.println(r1.price);

        Speaker s1 = new Speaker();

        s1.brand ="Boat";
        s1.qualityType = "nice";
        s1.price = 222000;

        Keyboard k1 = new Keyboard();

        k1.brand = "acer";
        k1.noOfKeys=101;
        k1.price=2500;

        Display d1 = new Display();

        d1.brand = "dell";
        d1.resolution = "led";




    }
}
