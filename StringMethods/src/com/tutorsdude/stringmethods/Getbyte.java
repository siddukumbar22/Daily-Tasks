package com.tutorsdude.stringmethods;

public class Getbyte {

    public static void main(String[] args) {

        String myStr = "going to school";
        String myStr1 = "hello sir";

        byte[] result = myStr.getBytes();
        byte[] output = myStr1.getBytes();

        System.out.println(result[12]);
        System.out.println(output[2]);
    }
}
