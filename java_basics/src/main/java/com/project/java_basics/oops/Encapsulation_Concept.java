//Program to show use og Getter n Setter (Access from another class)

package com.project.java_basics.oops;

class Practice{
    private int empid;
    private String empname;
    private int empage;

    private String empemail;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }
}

public class Encapsulation_Concept {
    public static void main(String args[]){
        Practice gs= new Practice();
        gs.setEmpid(12);
        gs.setEmpname("getter n setter");
        gs.setEmpage(5);
        gs.setEmpemail("gs@gmail.com");
        System.out.println(gs.getEmpid());
        System.out.println(gs.getEmpname());
        System.out.println(gs.getEmpage());
        System.out.println(gs.getEmpemail());
    }
}
