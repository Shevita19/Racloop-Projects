package com.project.java_basics.oops;

abstract class Shape {
    abstract int area(int side);
    abstract void display();

    Shape(){
        System.out.println("I am a constructor");
    }

    void statusShape(){
        System.out.println("I am shape class");
    }
}

class Square extends Shape {

    @Override
    int area(int side) {
        return side*side;
    }
    void display() {
        System.out.println("This is square");
    }
}

abstract class Rectangle extends Shape{
    void status(){
        System.out.println("Rectangle is created");
    }
}
public class AbstractInterface_Concept {

public static void main(String args[]){
Shape squ= new Square();
//squ.area(2);
    System.out.println("Area of square: " + squ.area(2));
    squ.display();
    squ.statusShape();
    //Shape rect= new Rectangle();   //will show error as we can not create object of abstract class.

}
}
