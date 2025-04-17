package com.tutorsdude.stringmethods;

public class Equals {
    public static void main(String[] args) {

        String myStr1 = "Apple";
        String myStr2 = "RCB";
        String myStr4 = "virat";
        String myStr5 = "virat";
        String myStr6 = "RCB";
        String myStr7 = "Apple";

        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr1.equals(myStr7));
        System.out.println(myStr1.equals(myStr6));
        System.out.println(myStr6.equals(myStr7));
        System.out.println(myStr2.equals(myStr6));
        System.out.println(myStr4.equals(myStr5));
    }
}
