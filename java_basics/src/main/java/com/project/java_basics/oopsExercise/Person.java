package com.project.java_basics.oopsExercise;

import java.util.Date;

abstract public class Person {
        private String firstname;

        private String lastname;
        private String address;
        private int age;
        private Date dob;
        private int id;

        abstract void status();


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

