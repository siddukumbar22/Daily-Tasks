package com.toturesdude.crud.Bike;

public class BikeStorage {

    String [] Bikes = new String[5];

    public static void addBikes(String honda) {
    }

    public void addBike(String Names){
        if (Names!= null && Names.length()> 4){

            for (int i = 0; i < Bikes.length; i++) {
                if (Bikes[i] == null){
                    Bikes[i] = Names;
                    System.out.println("Bikes" + Names);
                    return;
                }
                else {
                    System.out.println("index copied , so going to next index");
                }

            }
            System.out.println("space is over");

        }
        else {
            System.out.println("Bike is not available");
        }

    }

    public String[] readAll (){
        return Bikes;
    }
}


