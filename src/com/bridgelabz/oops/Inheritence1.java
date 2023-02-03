package com.bridgelabz.oops;

// Inheritence => Acquiring the properties of parent class into child class is inheritence
// IS-A Relationship
// To do inheritence we use extends keyword

class Animal{
    int x;

    void m1(){
        System.out.println("m1 of Animal");
    }
}


class Monkey extends Animal {
   int y;

   void m2(){
       System.out.println("m2 of Monkey");
   }
}

class Cat extends Animal{
    int z;

    void m3(){
        System.out.println("m3 of Cat");
    }
}



public class Inheritence1 {

    public static void main(String[] args) {
        Animal obj1 = new Animal();
        System.out.println(obj1.x);
        obj1.m1();

        Monkey obj2 = new Monkey();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(obj2.x);
        obj2.m1();

        Cat obj3 = new Cat();
        System.out.println(obj3.z);
        obj3.m3();
        System.out.println(obj3.x);
        obj3.m1();


    }
}
