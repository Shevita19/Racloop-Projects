//Program to show use of Interfaces (Multiple Inheritance)

package com.project.java_basics.oops;
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn();
    void stopHorn();
}
class AvonCycle implements Bicycle, HornBicycle{
    void horn(){
        System.out.println("Method of AvonCycle");
    }
    public void applyBrake(int decrement){
        System.out.println("Brake applied: " + decrement);
    }
    public void speedUp(int increment){
        System.out.println("Speed increased: " + increment);
    }
    public void blowHorn(){
        System.out.println("Blow Horn");
    }
    public void stopHorn(){
        System.out.println("Stop Horn");
    }
}
public class Interface_Concept {
    public static void main(String args[]){
        AvonCycle ob= new AvonCycle();
        ob.applyBrake(5);
        ob.speedUp(2);
        ob.blowHorn();
        ob.stopHorn();
    }
}
