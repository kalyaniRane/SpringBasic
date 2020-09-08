package com.bridgelabz.dependencyinjection.constructordi;

public class Student {

    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student name: "+studentName);
    }

}
