package com.project.java_basics.oopsExercise;


public class Standard {

    private Name name;
    private Section section;
    private int strength;

    public String toString() {
        return "Standard{" +
                "name=" + name +
                ", section=" + section +
                ", strength=" + strength +
                '}';
    }




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

enum Name {
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

enum Section {
    A, B, C, D, E, SCIENCE, MATHS, COMMERCE,

}

