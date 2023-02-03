package com.bridgelabz.oops;


import com.bridgelabz.basics.VariableTypes2;

public class Sample3 {

    public static void main(String[] args) {
//        System.out.println(VariableTypes2.staticVar);
        Person person1 = new Person();
//        System.out.println(person1.age);
//        System.out.println(person1.name);
//        System.out.println(person1.gender);
        person1.setName("Amit");
        person1.setAge(32);
        person1.setGender("male");



        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
        System.out.println();
        Person person2 = new Person();
        person2.setGender("female");
        person2.setName("Neha");
        person2.setAge(23);

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGender());
    }
}
