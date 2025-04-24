package com.toturesdude.crud;

import com.toturesdude.crud.Bike.BikeStorage;

public class BikeRunner {

    public static void main(String[] args) {

        BikeStorage bikeStorage = new BikeStorage();

        bikeStorage.addBike("Honda");
        bikeStorage.addBike("TVS");
        bikeStorage.addBike("KTM");
        bikeStorage.addBike("Hero");
        bikeStorage.addBike("BMW");
        bikeStorage.addBike("Honda");

        String[] bikes = bikeStorage.readAll();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i]);}
        }


    }



