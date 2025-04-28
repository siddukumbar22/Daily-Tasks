package com.toturesdude.crud;

import com.toturesdude.crud.Bike.BikeStorage;

public class BikeRunner {
    public static void main(String[] args) {

        BikeStorage bikeStorage = new BikeStorage();

        bikeStorage.addBike("tvs");
        bikeStorage.addBike("bmw");
        bikeStorage.addBike("hero");
        bikeStorage.addBike("suzuki");
        bikeStorage.addBike("honda");
        bikeStorage.addBike("ninja");
        bikeStorage.addBike("splendor");
        bikeStorage.addBike("unicorn");


        String[]bikes = bikeStorage.readAll();

        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i]);
        }
        boolean result = bikeStorage.find("splendor");
        System.out.println(result);




        String[]bikes1 = bikeStorage.readAll();

        for (int i = 0; i < bikes1.length; i++) {
            System.out.println(bikes1[i]);
        }
        boolean result1 = bikeStorage.update("ninja" , "zx");
        System.out.println(result1);



        String[]bikes2 = bikeStorage.readAll();

        for (int i = 0; i < bikes2.length; i++) {
            System.out.println(bikes2[i]);

        }
        boolean result2 = bikeStorage.delete("unicorn");
        System.out.println(result2);
        
        }
    }




