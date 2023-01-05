package com.bridgelabz.basics;


// 3 types of variables
// local , static and instance(non-static) variables

// Local variables -> variables declared within a method or a block are called local variables
// The scope of these variables is within the method or block where these variables are declared
// It is mandatory to initialize local variables.

import java.util.Scanner;

public class VariableTypes1 {

//    void sum(){
//        int sum = x + y;
//    }

    static void m2() {
        System.out.println("this is method m2()");
    }

    // method definition
    static void m1() {
        int x = 20;
        System.out.println(x);
        System.out.println("this is method m1()");
//        m2();
    }

    static float sumOfTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        System.out.println("enter y");
        int y = scanner.nextInt();
        int sum = x + y;
        return sum;
    }

    static int sumOfThree(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }


    public static void main(String[] args) {

        int x = 10;
        System.out.println(x);

        // Method calling
        m1();
        System.out.println("abc");
        m1();
//        m2();


        float sum = sumOfTwo();
        System.out.println("Sum => " + sum);

        float sum3 = sumOfTwo();
        System.out.println("Sum => " + sum3);

        int sum2 = sumOfThree(1, 5, 9);
        System.out.println("Sum => " + sum2);


    }

}
