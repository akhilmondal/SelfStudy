package com.bridgelabz.datastructure.hashtable;

public class MainClass1 {

    public static void main(String[] args) {
        // String Constant Pool
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");
        String str4 = new String("ABC");

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        // String is Immutable
        String str5 = "BCD";
        String str6 = "BCD";
        str5 = "PQR";
        System.out.println(str5);
        String str7 = "BCD";
        System.out.println(str6 == str7);

    }
}
