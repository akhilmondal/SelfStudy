package com.bridgelabz.oops;


// Abstraction => Hiding the implementation and just showing the necessary details
// 2 types => Interface  and Abstract class

// Interface
// We will use interface when we don't know any of the implementations
// Interface is used for 100% Abstraction.
// Interface contains Abstract methods
// In an interface ,the abstract methods are bydefault public and abstract. So we don't need to mention public and abstract keywords while declaring.
// Interface can contain variables but they will always be public,static and final.So we don't need to mention public,static and final keywords while declaring.
// From Java 1.8V onwards, Interface can contain static methods as well as default methods.
// From Java 1.9V onwards, Interface can contain private methods also.
// private ,static and default methods must contain the implementation. These methods cannot be abstract(without body).
// The implementation class of an interface must override all the abstract methods of the interface . It is mandatory.
// Interface does not contain a constructor
// We cannot create an object of Interface
// private method can only be called inside the interface through default method implementation
// default method can be overridden in the implementation classes.
// static method can only be called using Interface name.

// Abstract methods
// Methods with only declarations and without any implementation(without any method body)

// Example:- Calculator(Interface) => calculate();(abstract method) => Sum implements Calculator => calculate(){ Impl. related to Sum}  , Multiply implements Calculator => calculate(){ Impl. related to Product}

interface Calculator {

    int X = 10;

    int calculate(int x, int y);

    void m4();

    default void m1() {
        m3();
        System.out.println("default of Interface");
    }

    static void m2() {
        System.out.println("static of Interface");
    }

    private void m3() {
        System.out.println("private of Interface");
    }
}

class Sum implements Calculator {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }

    @Override
    public void m4() {

    }

    @Override
    public void m1() {
        System.out.println("default of Sum");
    }
}

class Product implements Calculator {

    @Override
    public int calculate(int x, int y) {
        return x * y;
    }

    @Override
    public void m4() {

    }
}


public class Abstraction1 {

    public static void main(String[] args) {

        Calculator.m2();
        System.out.println(Calculator.X);

        Sum sumObj = new Sum();
        System.out.println("Sum is => " + sumObj.calculate(4,8));
        sumObj.m1();

        Calculator productObj = new Product();
        System.out.println("Product is  => " + productObj.calculate(5,8));
        productObj.m1();

    }
}
