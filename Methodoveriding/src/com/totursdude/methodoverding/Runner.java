package com.totursdude.methodoverding;

import com.totursdude.methodoverding.methodoveriding.Mobile;
import com.totursdude.methodoverding.methodoveriding.Redmi;

public class Runner {

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        mob.mobiledetails(4,"redmi");

        Redmi red = new Redmi();
        red.mobiledetails(7,"vivo");

    }
}
