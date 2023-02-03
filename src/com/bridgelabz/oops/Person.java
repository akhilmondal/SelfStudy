package com.bridgelabz.oops;

public class Person {
// Encapsulation => Binding of data into a single unit is called encapsulation
// We achieve data hiding through encapsualtion
    private String name;
    private String gender;
    private int age;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    // If we are not creating any constructor in the class then compiler will create a default constructor in the class
//    public Person(){
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
