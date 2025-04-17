package com.totursdude.Example;

public class Example {
    public static void main(String[] args) {

        class Example {
            int a;

            Example() {
                this(100);
                System.out.println("Default Constructor");
            }

            Example(int x) {
                a = x;
                System.out.println("Parameterized Constructor: " + a);
            }

            public static void main(String[] args) {
                Example e = new Example();
            }
        }

}
