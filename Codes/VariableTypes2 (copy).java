package com.bridgelabz.basics;


// Static Variable
// Static variable is a class-level variable
// Static variable will get the memory when class loading happens by the class loader.(class loader takes the .class file and loads it into the method area of JVM memory)
// Static variable will be loaded in the method area.
// There will be only one copy of this variable at class level shared to all the members of the class and across all objects.
// If at any point the value of the static variable is changed, it will change for all the members of a class bcoz there is one copy
// It is not mandatory to initialize a static variable. If we are not initializing then it will take default value based on the data type.
// Static variable will be declared inside the class but outside of any of the methods.
// We have to use static keyword for declaring static variable
// Within the same class, static variable can be accessed directly
// Outside a class ,static variable will be accessed using class name or object.

// Instance Variable
// Instance variable is a object-level variable
// Instance variable will get the memory when Object is created and memory is allocated.
// Instance variable will be loaded in the heap area
// There will be only one copy of this variable at object level and it is independent of other objects.
// Within the same class or outside the class, instance variable can be accessed through object only.
// If at any point the value of the instance variable is changed, it will change only for that object
// It is not mandatory to initialize an instance variable. If we are not initializing then it will take default value based on the data type.
// Instance variable will be declared inside the class but outside of any of the methods.


import java.util.Collections;

public class VariableTypes2 {

    static int staticVar;

    static void m1(){
        System.out.println(staticVar); // 49
        staticVar = 32;
        System.out.println(staticVar); // 32
    }

    public static void main(String[] args) {

        System.out.println(staticVar); // 0
        staticVar = 49;
        System.out.println(staticVar); // 49
        m1();
        System.out.println(staticVar); // 32
        staticVar = 50;
        System.out.println(staticVar); // 50
    }
}
