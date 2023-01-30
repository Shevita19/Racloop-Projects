package com.project.java_basics.oopsExercise;

import java.util.Date;

public class Main {

    public static void main(String args[]){
        Teacher ob= new Teacher("ABC", "PYTHON", true, "Professor", 50000, new Date());

        //String pattern = "MM-dd-yyyy";
      //  SimpleDateFormat simpleDateFormat = new SimpleDateFormat( pattern ) ;
        Standard s=new Standard(Name.Standard_1, Section.COMMERCE, 5);

        Student ob1=new Student("XYZ", 22, "JAVA",s, 44 );
        System.out.println(ob);
        System.out.println(ob1);

    }
}
