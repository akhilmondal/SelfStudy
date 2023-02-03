package com.bridgelabz.oops;


// Abstract class
// We will use abstract class when we know partial implementations
// Abstract class is used for 0% to 100% Abstraction.
// Abstract class contains Abstract methods(methods without body) as well as concrete method(methods with implementation)
// We need to mention abstract keyword while declaring abstract methods. Abstract methods cannot be private.
// Abstract class can contain any kind of variables.
// The child class of abstract class can override either all or some of the abstract methods. It is not mandatory to override all the abstract methods.
// Abstract class contains a constructor because the variables of abstract class has to be initialized.
// We cannot create an object of Abstract class

 abstract class Demo1 {


    int x = 10;

    static int y = 30;


    Demo1(){

    }

    void m1() {
        System.out.println("m1");
    }

    static int m2() {
        System.out.println("m2");
        return 10;
    }

    abstract void m3();

    abstract int m4(int z);

}


abstract class Demo2 extends Demo1 {
    @Override
    void m3() {
        System.out.println("m3 of Demo2");
    }


}

class Demo3 extends Demo2{

//    @Override
//    void m3() {
//        System.out.println("m3 of Demo3");
//    }

    @Override
    int m4(int z) {
        System.out.println("m4 of Demo3");
        return 0;
    }
}

public class Abstraction2 {


    public static void main(String[] args) {

        Demo1 obj1 = new Demo3();
        System.out.println(obj1.x);
        obj1.m1();
        obj1.m3();
        obj1.m4(5);
    }
}
