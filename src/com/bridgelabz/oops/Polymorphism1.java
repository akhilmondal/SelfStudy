package com.bridgelabz.oops;


// Poly -> many
// morph -> forms
// Compile-Time Polymorphism -> Overloading
// Run-Time Polymorphism -> Overriding

import com.bridgelabz.basics.Dog;

public class Polymorphism1 {

    void m1() {
        System.out.println("m1()");
    }

    static void m1(int x) {
        System.out.println("m1(int)");
    }

    void m1(float y) {
        System.out.println("m1(float)");
    }

    static void m1(int x, int y) {
        System.out.println("m1(int,int)");
    }

    double m1(double x, double y) {
        System.out.println("m1(double,double)");
        return 4.3;
    }

    void m1(int x, double y) {
        System.out.println("m1(int,double)");
    }

    void m1(Dog dog){
        System.out.println("m1(Dog)");
    }


    // Method signature
    // method name along with arguments is called method signature

    // Overloading
    // 2 or more methods having same name but different number of arguments or different type of arguments
    // While overloading return type does not play a role.
    // Method can be static or non-static.
    public static void main(String[] args) {
        Polymorphism1 obj1 = new Polymorphism1();
        obj1.m1();
        m1(5);
        m1(1,4);
        obj1.m1(4.6F);
        obj1.m1(3,5.0);
        double res = obj1.m1(7.4,4.5);
        System.out.println(res);
        obj1.m1(new Dog());

    }
}
