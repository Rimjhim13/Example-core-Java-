package com.allexample.abstractEx;

abstract class Abstract3 {
    // Abstract method
    abstract public void show();

    // Static method
    static void displayStatic() {
        System.out.println("Static method in Parent class");
    }

    // Non-static method
    void displayInstance() {
        System.out.println("Instance method in Parent class");
    }
}
