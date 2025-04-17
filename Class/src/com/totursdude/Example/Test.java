package com.totursdude.Example;

public class Test {
    int num = 5;

    void modify(Test obj) {
        obj.num += 10;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.modify(t1);
        System.out.println("Value: " + t1.num);
    }

}
