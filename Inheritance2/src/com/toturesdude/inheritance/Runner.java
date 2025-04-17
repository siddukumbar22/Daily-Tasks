package com.toturesdude.inheritance;

import com.toturesdude.inheritance.Multilevel.Huskey;
import com.toturesdude.inheritance.single.Car;

public class Runner {

    public static void main(String[] args) {


        Car c1 = new Car();

        c1.colour = "red";
        c1.Name = "car";
        c1.name = "BMW";
        c1.price = 100000;
        c1.noOfWheels = 4;
        c1.run();
        c1.move();


        System.out.println(c1.colour);
        System.out.println(c1.Name);
        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.noOfWheels);

        Huskey h1 = new Huskey();

        h1.colour ="Brown";
        h1.type = "Domastic";
        h1.hairsColour = "white";
        h1.name = "Dog";
        h1.noOfEyes = 2;
        h1.noOfLegs = 4;
        h1.live();
        h1.eat();
        h1.run();

        System.out.println(h1.colour);
        System.out.println(h1.type);
        System.out.println(h1.hairsColour);
        System.out.println(h1.name);
        System.out.println(h1.noOfEyes);
        System.out.println(h1.noOfLegs);


    }
}
