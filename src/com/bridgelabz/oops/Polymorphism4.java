package com.bridgelabz.oops;


class Animal3 {
    int x;

    void m1() {
        System.out.println("m1 of Animal");
    }
}

class Cat3 extends Animal3 {
    int z;

    void m3() {
        System.out.println("m3 of Cat");
    }
}


class Test{

    void methodA(Animal3 obj){
        System.out.println("methodA(Animal)");
    }

    void methodA(Cat3 obj){
        System.out.println("methodA(Cat)");
    }
}
public class Polymorphism4 {

    public static void main(String[] args) {
        // String class methods
//        String str = "ABC";
//        int x = 10;
//        System.out.println(str.toLowerCase());

        Animal3 animal = new Animal3();
        Cat3 cat = new Cat3();
        Animal3 obj = new Cat3();

        Test test = new Test();
        test.methodA(animal); // methodA(Animal)
        test.methodA(cat);    // methodA(Cat)
        test.methodA(obj);    // methodA(Animal)

        // When we are overloading, method resolution is taken care by compiler based on reference type
        // Compile-time polymorphsim , static polymorphism , early binding.


    }
}
