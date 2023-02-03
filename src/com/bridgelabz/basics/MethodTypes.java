package com.bridgelabz.basics;

public class MethodTypes {

    static int staticVar;

    int instanceVar;
    // Methods -> static and non-static

    // From a static-context , we cannot access non-static things directly
    // From a non-static-context , we can access static things directly


    // class-level method or static-method
    static void m1() {
        System.out.println("b => " + staticVar); // 10
        System.out.println("m1");
//        m2();
//        System.out.println(obj1.instanceVar);
    }


    // Object-level method  or non-static method
    void m2(int instanceVar) {
        System.out.println("e => " + staticVar); // 10
        staticVar = 32;
        System.out.println("f => " + staticVar); // 10
        System.out.println("g => " + instanceVar);
        // this keyword refers to the current object
        System.out.println("h => " + this.instanceVar); // 21 // 0
        System.out.println("m2");
        m3();
        m4();
    }

    void m3(){
        System.out.println("m3");
        m4();
    }

    static void m4(){
        System.out.println("m4");
    }

    public static void main(String[] args) {
        System.out.println(" main method is starting ..... ");
        System.out.println("a => " + staticVar); // 0
        staticVar = 10;

        m1();

        System.out.println("c => " + staticVar); // 10
        MethodTypes obj1 = new MethodTypes(); //
        System.out.println("d => " + obj1.instanceVar); // 0
        obj1.instanceVar = 21;
        obj1.m2(2);
        System.out.println("d => " + obj1.instanceVar); // 21
        System.out.println("i => " + staticVar); // 32
        System.out.println("j => " + obj1.instanceVar); // 21


        System.out.println("************************");

        MethodTypes obj2 = new MethodTypes(); //
        System.out.println("d => " + obj2.instanceVar); // 0
        obj2.m2(6);
        obj2.instanceVar = 24;
        System.out.println("d => " + obj2.instanceVar);// 24
        System.out.println("i => " + obj2.instanceVar);// 24

//        m1();


//        obj1.m2();
//        MethodTypes obj2 = new MethodTypes();
//        System.out.println(obj2.instanceVar);
    }
}
