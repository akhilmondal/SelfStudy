package com.bridgelabz.basics;

public class Sample1 {

    public static void main(String[] args) {
        System.out.println(VariableTypes2.staticVar);
        int x = 10;
        System.out.println(x);

        // A special method having same name as class name is called constructor
        // A constructor is used for initializing an object
        // new Dog(); => Object in the memory is created
        // Dog dog1 => Reference pointing to the object
        Dog dog1 = new Dog(); // one copy of breed ,age and color gets created in the memory

        System.out.println(dog1.age); // 10
        System.out.println(dog1.breed); // ABC
        System.out.println(dog1.color); // null
        dog1.age = 1;
        dog1.breed = "Labrador";
        System.out.println(dog1.breed);
        dog1.breed = "German sheffard";
        dog1.color = "brown";
        System.out.println(dog1.age); // 1
        System.out.println(dog1.breed); // null
        System.out.println(dog1.color); // null

        Dog dog2 = new Dog();// another copy of breed ,age and color gets created in the memory
        System.out.println(dog2.age); // 10
        System.out.println(dog2.breed); // null
        System.out.println(dog2.color); // null
        dog2.age = 5;
        dog2.breed = "Husky";
        dog2.color = "white";
        System.out.println(dog2.age); // 5
        System.out.println(dog2.breed); // null
        System.out.println(dog2.color); // null

        Employee employee1 = new Employee();
        employee1.employeeId = 123;
        employee1.employeeName = "Akhil";

        Employee employee2 = new Employee();
        employee2.employeeId = 345;
        employee2.employeeName = "Dnyaneshwar";


    }
}
