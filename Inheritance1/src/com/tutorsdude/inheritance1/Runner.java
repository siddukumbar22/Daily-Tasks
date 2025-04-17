package com.tutorsdude.inheritance1;

import com.tutorsdude.inheritance1.Heirachical.Apple;
import com.tutorsdude.inheritance1.Heirachical.Ladyfinger;
import com.tutorsdude.inheritance1.Heirachical.Redapple;
import com.tutorsdude.inheritance1.Hybrid.Laptop;
import com.tutorsdude.inheritance1.Multiple.Person;
import com.tutorsdude.inheritance1.multilevel.Animal;
import com.tutorsdude.inheritance1.multilevel.Dog;
import com.tutorsdude.inheritance1.multilevel.Labrodar;
import com.tutorsdude.inheritance1.single.Car;


public class Runner {

    public static void main(String[] args) {

        Car car = new Car();
        car.battery = "exide";
        car.average = 12;
        car.brand = "benz";
        car.colour = "black";
        car.move();

        System.out.println(car.battery);
        System.out.println(car.average);
        System.out.println(car.brand);
        System.out.println(car.colour);

        Dog d1 = new Dog();
        d1.name = "honey";
        d1.colour = "black";
        d1.noOfEyes = 2;


        System.out.println(d1.colour);
        System.out.println(d1.name);
        System.out.println(d1.noOfEyes);

        Labrodar l1 = new Labrodar();

        l1.Bark();
        l1.eat();

        Person p1 = new Person();

        p1.work();
        p1.colour = "black";
        p1.name = "Abhi";

        System.out.println(p1.colour);
        System.out.println(p1.name);

        Redapple r1 = new Redapple();

        r1.colour = "red";
        r1.price = 70;
        r1.available();

        System.out.println(r1.colour);
        System.out.println(r1.price);

        Ladyfinger lady = new Ladyfinger();

        lady.taste();
        lady.place = "kashmir";

        System.out.println(lady.place);

        Laptop lap = new Laptop();

        lap.brand = "dell";
        lap.price = 56000;
        lap.performance();

        System.out.println(lap.brand);
        System.out.println(lap.price);
    }
}
