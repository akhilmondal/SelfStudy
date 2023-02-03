package com.bridgelabz.basics;

// From a static-context , we cannot access non-static things directly
// From a non-static-context , we can access static things directly
public class MethodTypes2 {

    int instanceVar;

    static int staticVar;

    // Object-level method  or non-static method
    void m1(){
        int instanceVar = 10;
        System.out.println(staticVar);
        System.out.println("m1()");
        m2();
        System.out.println(instanceVar); // 0 10     3
        // this keyword refers to the current object
        System.out.println(this.instanceVar);
        instanceVar = 20;
        System.out.println(instanceVar); // 20      20
    }

     // class-level method
    static void m2(){
        System.out.println("m2()");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(staticVar);

        m2();

        MethodTypes2 obj1 = new MethodTypes2();
        System.out.println(obj1.instanceVar); // 0
        obj1.instanceVar = 10;
        obj1.m1();
        System.out.println(obj1.instanceVar); // 20

        MethodTypes2 obj2 = new MethodTypes2();
        obj2.instanceVar = 3;
        System.out.println(obj2.instanceVar); // 3
        obj2.m1();
        System.out.println(obj2.instanceVar); // 20


    }

}
