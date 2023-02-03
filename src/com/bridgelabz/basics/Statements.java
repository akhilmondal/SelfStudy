package com.bridgelabz.basics;


// Sequential , Selection , Repetitive
public class Statements {


    private static void m1() {
        System.out.println("m1()");
    }

    public static void main(String[] args) {
        System.out.println("main starting");
        int x = 10;
        int y = 23;
        m1();
        if (x > 0) {
            System.out.println("x > 0");
        } else {
            System.out.println("x not > 0");
        }

        if (y > 23) {
            System.out.println("y is > 23");
            int d = 0;
            if (d < 0) {
                System.out.println(x);
                System.out.println(d);
                System.out.println("d < 0");
            } else {
                System.out.println("d >= 0");
            }
        } else if (y < 23) {
//            System.out.println(d);
            System.out.println("y is < 23");
        } else {
            System.out.println(" y is = 23");
        }
//        System.out.println(d);


    }


}
