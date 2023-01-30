package com.project.java_basics.oopsExercise;

import java.util.Date;


public class Teacher extends Person {

        private String name;
        private String subjects;
        private boolean permanent;
        private String designation;
        private double salary;
        private Date date;
@Override
    public void status(){
    System.out.println("abstract code in teacher class");
}
        Teacher(String name, String subjects, boolean permanent, String designation, double salary, Date date) {
            this.name = name;
            this.subjects = subjects;
            this.permanent = permanent;
            this.designation = designation;
            this.salary = salary;
            this.date = date;
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

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", subjects='" + subjects + '\'' +
                    ", permanent=" + permanent +
                    ", designation='" + designation + '\'' +
                    ", salary=" + salary +
                    ", date=" + date +
                    '}';
        }
    }

