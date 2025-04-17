package com.tutorsdude.Methodvoerloading;

import com.tutorsdude.Methodvoerloading.Types.Methodoverloding;
import com.tutorsdude.Methodvoerloading.Types.ResultSheet;
import com.tutorsdude.Methodvoerloading.Types.Television;

public class Runner {
    public static void main(String[] args) {

        Methodoverloding m1 = new Methodoverloding();
        m1.computer(54000, "lenova");

        Methodoverloding m2 = new Methodoverloding();
        m2.computer("dell",58000);

        Methodoverloding m3 = new Methodoverloding();
        m3.computer("asus","Ryzon",60000);

        Television T1 = new Television();
        T1.info(25000);

        Television T2 = new Television();
        T2.info("onida");

        Television T3 = new Television();
        T3.info(32.6f);

        int abhi =ResultSheet.Marks(78,98);
        System.out.println(abhi);

        int kalinga =ResultSheet.Marks(87,83,67);
        System.out.println(kalinga);

        int manju =ResultSheet.Marks(78,98);
        System.out.println(manju);



    }
}
