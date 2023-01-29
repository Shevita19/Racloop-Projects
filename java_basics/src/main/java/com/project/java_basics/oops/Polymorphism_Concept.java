//Program to use of Inheritance and Polymorphism

package com.project.java_basics.oops;

class Animal {
    void sleep() {
        System.out.println("sleeping");
    }
}
class Dog extends Animal {

    void sleep(){
        System.out.println("dog is sleeping");
    }
}

class Cat extends Animal {

    void sleep(){
        System.out.println("cat is sleeping");
    }
}
public class Polymorphism_Concept {
public static void main (String[] args) {
    Animal obj = new Dog();
    obj.sleep();
    Animal obj1 = new Cat();
    obj1.sleep();
}
}
