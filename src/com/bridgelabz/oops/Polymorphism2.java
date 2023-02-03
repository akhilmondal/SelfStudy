package com.bridgelabz.oops;


class Animal1 {
    void m1() {
        System.out.println("m1() of Animal1");
    }

    Person m3(){
        System.out.println("m3() of Animal1");
        Student studentObj = new Student();
        return studentObj;
    }
}

class Cat1 extends Animal1 {


    @Override
    void m1() {
        System.out.println("m1() of Cat1");
    }

    void m2() {
        System.out.println("m2() of Cat1");
    }

    @Override
    Student m3() {
        System.out.println("m3() of Cat1");
        Student studentObj = new Student();
        return studentObj;
    }
}

public class Polymorphism2 {
    // Overriding =>
    // When we are inheriting , if we are not satisfied with implementation of the parent class method  inherited into child, we can override that method in child class and provide our own implementation
    // While overriding method name and argumets remain same.
    // In overriding , return type can be same or it can be covarient(Parent-child relationship)
    public static void main(String[] args) {

        Cat1 obj1 = new Cat1();
        obj1.m2();
        obj1.m1();

    }
}
