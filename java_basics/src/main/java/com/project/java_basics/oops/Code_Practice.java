package com.project.java_basics.oops;

import java.util.Date;

class Person {
    private String firstname;

    private String lastname;
    private String address;
    private int age;
    private Date dob;
    private int id;

    Person() {
        System.out.println("I am parent class constructor");
    }

    Person(String firstname, String lastname, String address, int age, Date dob, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Teacher extends Parent {

    private String name;
    private String subjects;
    private boolean permanent;
    private String designation;
    private double salary;
    private Date date;

    Teacher(String name, String subjects, boolean permanent, String designation, double salary, Date date) {
        this.name = name;
        this.subjects = subjects;
        this.permanent = permanent;
        this.designation = designation;
        this.salary = salary;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return name+" " + subjects+" " + permanent+" "+ designation+" "+salary+" "+ date;
    }
}

    class Student extends Person{
        private String name;
        private int rollno;

        private String subjects;

        private int marks;
        Student(String name, int rollno, String subjects, int marks){
            this.name= name;
            this.rollno=rollno;
            this.subjects=subjects;
            this.marks=marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getSubjects() {
            return subjects;
        }

        public void setSubjects(String subjects) {
            this.subjects = subjects;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public String toString(){
            return name+" " + rollno+" " + subjects+" "+ marks;
        }
    }

    class Standard {
    public enum Name {
        Standard_1("1st"),
        Standard_2("2nd"), // add other standard if u want
        ;

        private String label;

        Name(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Section {
        A, B, C, D, E, SCIENCE, MATHS, COMMERCE,

    }

    private Name name;
    private Section section;
    private int strength;

    public Standard(Name name, Section section, int strength) {
        this.name = name;
        this.section = section;
        this.strength = strength;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

public class Code_Practice {

    public static void main(String args[]){
        Teacher ob= new Teacher("ABC", "PYTHON", true, "Professor", 50000, new Date());

        //String pattern = "MM-dd-yyyy";
      //  SimpleDateFormat simpleDateFormat = new SimpleDateFormat( pattern ) ;
        Student ob1=new Student("XYZ", 22, "JAVA", 45);
        System.out.println(ob);
        System.out.println(ob1);
    }
}
