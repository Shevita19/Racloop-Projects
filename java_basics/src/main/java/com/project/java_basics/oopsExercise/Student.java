package com.project.java_basics.oopsExercise;



public class Student extends Person {
    private String name;
    private int rollNo;
    private Standard standard;
    private String subjects;
    private int marks;

    @Override
    public void status(){
        System.out.println("abstract code in student class ");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", standard=" + standard +
                ", subjects='" + subjects + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void studentDetails(String name, int rollNo){
            System.out.println("Student details are : " + name + " " + rollNo);
    }

    public void studentDetails(String name, int rollNo, int marks){
        System.out.println("Student details are : " + name + " " + rollNo + " " + marks);
    }

    Student(String name, int rollNo, String subjects, Standard standard, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = subjects;
        this.standard = standard;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollNo;
    }

    public void setRollno(int rollno) {
        this.rollNo = rollno;
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

}


