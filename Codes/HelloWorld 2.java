package com.bridgelabz.basics;


// JDK - Java development kit
// JRE - Java Runtime Environment
// JVM - Java Virtual Machine

// .java file(source code) is taken by compiler which converts this file into .class file(byte code)
// .class file (byte code) is loaded by class loader into the method area of JVM memory
// the bytecode finally gets converted into machine readable code by JVM.
// Finally the main thread inside JVM executes the main method

public class HelloWorld {

    static void m1() {

    }

    public static void main(String[] args) {

        HelloWorld obj = new HelloWorld();
        System.out.println("Hello World");
        System.out.println("abc");
        int x = 0;
        m1();
        System.out.println("bcd");
    }
}
