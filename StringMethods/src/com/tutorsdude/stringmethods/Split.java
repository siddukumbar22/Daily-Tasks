package com.tutorsdude.stringmethods;

public class Split {
    public static void main(String[] args) {

        String myStr = "Split a string by spaces, and also punctuation.";
        String regex = "[a]";
        String[] myArray = myStr.split(regex);
        for (String s : myArray) {
            System.out.println(s);
        }
    }
}
