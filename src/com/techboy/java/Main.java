package com.techboy.java;

import com.techboy.java.annotations.Car;

/**
 * Copyright (C) 2021 <a color="#768af3">Java personal use</a>. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        printHi("Kıvanç");
        System.out.println("Hello world!");
    }
    // Method "Print Hi"
    @Car(brand = "NewArch", model = "T-2021", plate = "AAB9301")
    public static void printHi (String name) {
        System.out.printf("Hi, %s!\n", name);
    }
}