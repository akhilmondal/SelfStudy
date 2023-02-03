package com.bridgelabz.oops;

class Animal2 {
    int x;

    void m1() {
        System.out.println("m1 of Animal");
    }
}

class Cat2 extends Animal2 {
    int z;

    void m3() {
        System.out.println("m3 of Cat");
    }

    @Override
    void m1() {
        System.out.println("m1 of Cat");
    }
}

public class Polymorphism3 {

    public static void main(String[] args) {
        Animal2 obj1 = new Animal2();
        System.out.println(obj1.x);
        obj1.m1();

        Cat2 obj2 = new Cat2();
        System.out.println(obj2.z);
        obj2.m3();
        System.out.println(obj2.x);
        obj2.m1();

        // Parent class reference can hold child class object
        Animal2 obj3 = new Cat2();
        System.out.println(obj3.x);
        obj3.m1();
//        System.out.println(obj3.z);
//        obj3.m3();

        // When we override , the method resolution is taken care by JVM based on run-time object
        // Run-time Polymophsim , dynamic polymophism , lazy binding

        // Child class reference cannot hold parent class object
//        Cat2 obj4 = new Animal2();




    }
}
