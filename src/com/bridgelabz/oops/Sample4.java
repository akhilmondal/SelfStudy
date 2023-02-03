package com.bridgelabz.oops;


import com.bridgelabz.basics.AccessSpecifiers1;

public class Sample4 {

    public static void main(String[] args) {

//        System.out.println(AccessSpecifiers1.privateVar);
//        AccessSpecifiers1.privateMethod();
//        AccessSpecifiers1 obj1 = new AccessSpecifiers1();
//        System.out.println(obj1.privateInstanceVar);
//        obj1.privateInstanceMethod();

//        AccessSpecifiers1 obj1 = new AccessSpecifiers1();
//        System.out.println(AccessSpecifiers1.defaultVar);
//        AccessSpecifiers1.defaultMethod();
//        System.out.println(obj1.defaultInstanceVar);
//        obj1.defaultInstanceMethod();

        AccessSpecifiers1 obj1 = new AccessSpecifiers1();
        System.out.println(AccessSpecifiers1.publicVar);
        AccessSpecifiers1.publicMethod();
        System.out.println(obj1.publicInstanceVar);
        obj1.publicInstanceMethod();

    }
}
