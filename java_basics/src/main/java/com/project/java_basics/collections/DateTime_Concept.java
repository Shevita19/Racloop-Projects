package com.project.java_basics.collections;
import org.springframework.format.datetime.DateFormatterRegistrar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateTime_Concept {

    public static void main (String[] args){

       System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms " +System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());            //Highlighted methods are depreciated.
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMonth());
        System.out.println(d.getClass());
        System.out.println(d.getMinutes());
        System.out.println(d.getTimezoneOffset());

      //  Date d1= new Date();
      //  Date d2= new Date(2023, 02, 01);

       // System.out.println(d2.compareTo(d1));  // Returns 0 if the dates are equal; else, returns 1
     Date d2=new Date(1997,3,10);
     Date d1=new Date(1997,3,10);

     int comparison=d.compareTo(d1);
     System.out.println("Your comparison value is : "+comparison);
     System.out.println(d1);
        System.out.println(d2);
     //LocalDate

     LocalDate ld = LocalDate.now();
     System.out.println(ld);

     LocalTime t= LocalTime.now();
     System.out.println(t);

     LocalDateTime dt= LocalDateTime.of(2023, 2,1,8,52);
     System.out.println("Local Date Time is : " + dt);

     //DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy");
     DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM- dd- yyyy");
     // System.out.println(dtf); //will give format like - Value(DayOfMonth,2)'-'Value(MonthOfYear,2)'-'Value(YearOfEra,4,19,EXCEEDS_PAD)

     String myDate= dt.format(dtf);
     System.out.println(myDate);


    }
}
