package com.bridgelabz.basics;

public class WrapperClass {

    // primitive -> byte,short,int,long,float,double,char,boolean
    // Warpper class -> Byte , Short ,Integer , Long , Float , Double , Character , Boolean
    public static void main(String[] args) {
        int x = 10;

        Integer x1 = 10; // Object
        Byte x2 = 34;

        double l3 = 4.5;
        double l4 = 4.5;
//        System.out.println(l3.compareTo(l4));

        Double l1 = 3.7;
        Double l2 = 3.6;

        System.out.println(l1.compareTo(l2)); // -1, 0 ,1

        System.out.println(l1.equals(l2)); // true or false


    }
}
