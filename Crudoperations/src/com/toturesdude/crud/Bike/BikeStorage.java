package com.toturesdude.crud.Bike;

public class BikeStorage {

    String [] Bikes = new String[5];

    public void addBike(String Name){
        if (Name!= null && Name.length()> 4){

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

    public boolean delete(String value){
        if (value!=null  ){
            for (int i = 0; i < Bikes.length; i++) {
                if (Bikes[i].equals(value)){
                    Bikes[i] = null;
                    return true;
                }

            }
            System.out.println("the value is not found");
        }
        else {
            System.out.println("input are valid");
        }
        return false;
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


    public String[] readAll (){

        return Bikes;
    }



   public boolean find(String name){
        if (name!=null) {
           for (int i = 0; i < Bikes.length; i++) {
               if (name.equals(Bikes[i])) {
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



