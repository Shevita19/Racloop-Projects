//Program to illustrate use of class, constructor, final, static and this keyword.

package com.project.java_basics.classExamples;

public class Customer {
   private int id;
   private String name;
    private final int age=26;
   private static String city="NCR";                   //Shared by all customers

   /*static{
        age=25;
   } */

   // Customer() {
    //   int age=20;                      //default constructor to initialise age if it is declared as final only.
      //  System.out.println("Default constructor");

    //}

    public int getId() {
        return this.id;                 //this optional
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Customer.city = city;
    }

    Customer( int id1, String name1) {

      this.id = id1;
       this.name = name1;

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

      //  System.out.println(ob);         //will give object reference
       // System.out.println(ob1);         //will give object reference


    }

}
