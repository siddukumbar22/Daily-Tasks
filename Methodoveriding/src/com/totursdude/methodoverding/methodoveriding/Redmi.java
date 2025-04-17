package com.totursdude.methodoverding.methodoveriding;

public class Redmi extends Mobile {

    @Override
    public void mobiledetails(int series, String name){
        if (series <5){
            System.out.println("mobile series :" + series + "mobile name:" + name);
        }
        else if (series >5){
            System.out.println("mobile series :" + series + "mobile name:" + name);
        }
        else{
            System.out.println("mobile series :" + series + "mobile name:" + name);
        }
    }
}
