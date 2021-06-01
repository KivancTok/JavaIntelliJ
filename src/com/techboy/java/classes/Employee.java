package com.techboy.java.classes;

public class Employee {
    public String name_surname;
    public int age;
    public double work_length;
    public Employee(String name_surname, int age, double work_length) {
        this.name_surname = name_surname;
        this.age = age;
        this.work_length = work_length;
    }
    public void work() {
        System.out.printf("Worked for %s hours (%s seconds).\n", work_length, work_length * 3600);
    }
}
