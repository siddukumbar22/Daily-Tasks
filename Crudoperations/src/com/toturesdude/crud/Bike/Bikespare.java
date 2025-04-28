package com.toturesdude.crud.Bike;

public class Bikespare {
    String [] Bikes = new String[5];

    public void addBike(String Name){
        if (Name!= null && Name.length()> 2){

            for (int i = 0; i < Bikes.length; i++) {
                if (Bikes[i] == null){
                    Bikes[i] = Name;
                    System.out.println("Bikes" + Name);
                    return;
                }
                else {
                    System.out.println("index copied , so going to next index");
                }

            }
            System.out.println("space is over");

        }
        else
        {


            System.out.println("Bike is not available");
        }

    }



    public String[] readAll (){
        return Bikes;
    }

    public boolean update(String oldvalue,String newvalue){
        if (oldvalue!=null && newvalue!=null){
            for (int i = 0; i < Bikes.length; i++) {
                if (Bikes[i].equals(oldvalue)){
                    Bikes[i] = newvalue;
                    return true;
                }

            }
            System.out.println("the old value is not found");
        }
        else {
            System.out.println("input are valid");
        }
        return false;
    }

    public boolean find(String names){
        if (names!=null) {
            for (int i = 0; i < Bikes.length; i++) {
                if (names.equals(Bikes[i])) {
                    System.out.println("Bike Found");
                    return true;
                }
            }
            System.out.println("bike not found");
            return false;
        }
        else {
            System.out.println("Input not valid");
            return false;


        }
    }
}

