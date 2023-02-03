package com.bridgelabz.oops;


// Types Of Inheritence
// Single
// Multi-level
// Hierarchial
// Multiple
// Hybrid

class A {
    int x;

    void m1() {
        System.out.println("m1 of A");
    }
}

// Single Inheritence
class B extends A {
    int y;

    void m2() {
        System.out.println("m2 of B");
    }
}

// Multi-level
class C extends B {
    int w;
    void m3() {
        System.out.println("m3 of C");
    }
}

// Hierarchial
class D extends A {
    int z;
    void m4() {
        System.out.println("m4 of D");
    }
}

class E{
    void m7(){
        System.out.println("m7 of E");
    }
    void m5(){
        System.out.println("m5 of E");
    }
}

class F{
    void m7(){
        System.out.println("m7 of F");
    }
    void m6(){
        System.out.println("m6 of F");
    }
}

// Multiple Inheritence
// Not supported through classes because of ambiguity
// Because of the same reason hybrid inheritence also not supported
//class G extends E,F{
//
//    void m7(){
//        System.out.println("m7 of F");
//    }
//    void m7(){
//        System.out.println("m7 of E");
//    }
//
//}


public class InheritenceTypes {

    public static void main(String[] args) {
        System.out.println("Object of B");
        B obj1 = new B();
        System.out.println(obj1.x);
        obj1.m1();
        obj1.m2();
        System.out.println(obj1.y);

        System.out.println("********");
        System.out.println("Object of C");
        C obj2 = new C();
        System.out.println(obj2.w);
        obj2.m3();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(obj2.x);
        obj2.m1();

        System.out.println("********");
        System.out.println("Object of D");
        D obj3 = new D();
        System.out.println(obj3.z);
        obj3.m4();
        System.out.println(obj3.x);
        obj3.m1();


    }
}
