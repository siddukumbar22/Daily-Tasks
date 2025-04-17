package com.tutorsdude.Methodvoerloading.Types;

public class Methodoverloding {


    public void computer(int price, String Name) {
        System.out.println("computer price is :" + price);
        System.out.println("computer Name is :" + Name);
    }

    public void computer(String Name, int price) {
        System.out.println("computer price is :" + price);
        System.out.println("computer Name is :" + Name);
    }

    public void computer(String Name, String Processor, int price) {
        System.out.println("computer price is :" + price);
        System.out.println("computer Name is :" + Name);
        System.out.println("Processor is :" + Processor);
    }

}