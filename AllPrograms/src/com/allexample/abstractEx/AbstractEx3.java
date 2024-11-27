package com.allexample.abstractEx;



public class AbstractEx3 extends Child3 {
    public static void main(String[] args) {
        // Create an instance of Child
        Child3 child = new Child3();

        // Call the overridden methods
        child.show();
        child.displayInstance();

        // Call the static method from Parent class
        Abstract3.displayStatic();
    }
}

