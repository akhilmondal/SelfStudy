package com.bridgelabz.datastructure.hashtable;

import com.bridgelabz.basics.Dog;

public class MainClass2 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.hashCode());
        Dog dog2 = new Dog();

        Dog dog3 = dog2;
        System.out.println(dog2 == dog3);
        System.out.println(dog2.equals(dog3));
        dog2.age = 20;
        System.out.println(dog2.hashCode());
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
