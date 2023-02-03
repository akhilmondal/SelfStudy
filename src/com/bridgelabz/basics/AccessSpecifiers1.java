package com.bridgelabz.basics;


// Access specifiers
// private , public , default ,protected
// Defines the scope of the variables and methods.

public class AccessSpecifiers1 {

    // private => Will be available only within the same class
    private static int privateVar = 10;

    private int privateInstanceVar = 30;

    static private void privateMethod() {

    }

    private void privateInstanceMethod() {

    }

    // default => Will be available within the same package
    static int defaultVar;

    int defaultInstanceVar;

    void defaultInstanceMethod() {
        System.out.println("default Instance Method");
    }

    static void defaultMethod() {
        System.out.println("default method");
    }

    // public => Will be available across the packages
    public static int publicVar;

    public int publicInstanceVar;

    public static void publicMethod() {
        System.out.println("public method");
    }

    public void publicInstanceMethod() {
        System.out.println("public instance method");
    }

    // protected
    protected static int protectedVar;

    protected static void protectedMethod() {
        System.out.println("protected method");
    }


    protected int protectedInstanceVar;

    protected void protectedNonStaticMethod() {
        System.out.println("protected instance method");
    }


    public static void main(String[] args) {
        System.out.println(privateVar);
        privateMethod();
        AccessSpecifiers1 obj1 = new AccessSpecifiers1();
        System.out.println(obj1.privateInstanceVar);
        obj1.privateInstanceMethod();

        System.out.println(defaultVar);
        defaultMethod();
        System.out.println(obj1.defaultInstanceVar);
        obj1.defaultInstanceMethod();

        System.out.println(publicVar);
        publicMethod();
        System.out.println(obj1.publicInstanceVar);
        obj1.publicInstanceMethod();
    }
}
