package com.bridgelabz.generics;

import com.bridgelabz.oops.addressbook.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;

// Class-level generic will work only for object level variables and non-static methods
public class Generics2<E> {

    E x;


//    static E y;

    <T> void m1(E var, T var2){
        System.out.println(var);
    }


    static <V>void m2(V var){

    }

    public static void main(String[] args) {

        Generics2 obj1 = new Generics2();
        obj1.x = 34;
        obj1.m1(4,true);
        System.out.println(obj1.x);
        System.out.println("***************");
        obj1.x = true;
        obj1.m1(4.5F,12);
        System.out.println(obj1.x);
        System.out.println("*******************");
        Generics2<Integer> obj2 = new Generics2();
        obj2.x = 8;
        System.out.println(obj2.x);
//        obj2.x = true;
        obj2.m1(4,"ABC");
//        obj2.m1(4.5F);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
//        list.add("ABC");
         HashMap<String,Integer> map = new HashMap<>();
        map.put("ABC",223);
//        map.put(32,"ABC");

        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        AddressBook addressBook1 = new AddressBook();
        AddressBook addressBook2 = new AddressBook();
        addressBookHashMap.put("FriendsBook",addressBook1);
        addressBookHashMap.put("FamilyBook",addressBook2);

    }
}
