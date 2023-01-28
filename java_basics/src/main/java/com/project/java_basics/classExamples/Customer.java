//Program to illustrate use of class, constructor, final, static and this keyword.

package com.project.java_basics.classExamples;

public class Customer {
    int id;
    String name;
    final static int age;
    static String city="NCR";                   //Shared by all customers

    static{
        age=25;
    }

    /* Customer() {
        int age=20;                      //default constructor to initialise age if it is declared as final only.
        System.out.println("Default constructor");

    }*/
   Customer( int id, String name) {

       this.id = id;
       this.name = name;

       System.out.println("Parametrised Constructor");
   }
   void display(){
        System.out.println(id + " "+ name + " " + age + " " + city + " ");

    }

    public static void main(String args[]){
        Customer ob= new Customer(101, "XYZ");
        Customer ob1= new Customer(102, "ABC");
        ob.display();
        ob1.display();

    }

}
