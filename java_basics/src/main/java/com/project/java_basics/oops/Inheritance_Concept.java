//Program to illustrate use of Inheritance, constructor chaining and super keyword.

package com.project.java_basics.oops;

class Parent {

    Parent() {
        System.out.println("I am a base class constructor");
    }

    Parent(int x) {
       this();                     // will call default constructor (use in same class)
        System.out.println("Overloaded constructor of base class" + x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("I am a derived class constructor");
    }
   Child(int x, int y){

        super(x);                       ///use super to call constructor of different class
        System.out.println("Overloaded constructor of derived class:" + y);
    }
}
class SubChild extends Child{
    SubChild(){
        System.out.println("I am a sub child of childclass");
    }
    SubChild(int x, int y, int z){
        super(x,y);
        System.out.println("Overloaded constructor of sub child class:" + z);
    }
}

public class Inheritance_Concept {
    public static void main(String args[]){
        SubChild d= new SubChild  (5,10,15);


    }
}
