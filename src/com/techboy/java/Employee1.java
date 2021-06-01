package com.techboy.java;

import com.techboy.java.classes.Employee;

public class Employee1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jesse Fantasy Delight", 43, 8.5);
        System.out.println(emp1.age);
        emp1.work();
    }
}
