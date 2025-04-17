package com.tutorsdude.stringmethods;

public class Contact {
    public static void main(String[] args) {

        String firstName = " Siddu ";
        String lastName = "Kumbar";
        String CapitalCity = "locates in karnataka";
        String State = " Banglore ";
        String District = " koppala ";
        String taluk = " Gangavathi";

        System.out.println(firstName.concat(lastName));
        System.out.println(District.concat(taluk));
        System.out.println(State.concat(CapitalCity));

    }
}
