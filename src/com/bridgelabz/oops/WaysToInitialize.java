package com.bridgelabz.oops;

public class WaysToInitialize {

    public static void main(String[] args) {
        Person person1 = new Person();
//        System.out.println(person1.age);
//        System.out.println(person1.name);
//        System.out.println(person1.gender);
        person1.setName("Amit");
        person1.setAge(32);
        person1.setGender("male");
        System.out.println(person1.getGender() + " , " + person1.getName() + " , " + person1.getAge());

        System.out.println();

        Person person2 = new Person("Neha", 21, "female");
        System.out.println(person2.getGender());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

    }
}
