package com.bridgelabz.basics;

import java.util.Objects;

public class Dog {

    public String breed = "ABC";
    public String color;
    public int age = 10;

//    public Dog(){
//
//    }

    void eat(){
        System.out.println("eat()");
    }
//
//    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        System.out.println(dog1.age);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(breed, dog.breed) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
