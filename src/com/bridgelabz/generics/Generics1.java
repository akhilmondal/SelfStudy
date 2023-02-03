package com.bridgelabz.generics;


import com.bridgelabz.basics.Dog;

// Generics => For type-safety
// 2 types => Method level and Class level
// Generics => Will always take non-primitives
public class Generics1 {

//    static void printIntArray(int[] arr){
//        for (int x:arr) {
//            System.out.println(x);
//        }
//        System.out.println();
//    }
//
//    static void printBooleanArray(boolean[] arr){
//        for (boolean x:arr) {
//            System.out.println(x);
//        }
//        System.out.println();
//    }
//    static void printFloatArray(float[] arr){
//        for (float x:arr) {
//            System.out.println(x);
//        }
//        System.out.println();
//    }

    // Method-level generics
    // It can work on both static as well as non-static methods
    static <T> void printArray(T[] arr){
        for (T x:arr) {
            System.out.println(x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,7,3,6};
//        boolean[] arr2 = {false,true,true,false,true};
//        float[] arr3 = {5.6F,3.4F,1.4F,8.4F};

//        printIntArray(arr1);
//        printBooleanArray(arr2);
//        printFloatArray(arr3);

//        printArray(arr3);

        Integer[] arr1 = {1,2,3,7,3,6};
        Boolean[] arr2 = {false,true,true,false,true};
        Float[] arr3 = {5.6F,3.4F,1.4F,8.4F};
        Dog[] arr4 = {new Dog(), new Dog(), new Dog()};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);


    }
}
