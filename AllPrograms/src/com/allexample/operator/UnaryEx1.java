package com.allexample.operator;

public class UnaryEx1 {
    public static void main(String[] args)
    {

        int a = 10;
        int b = 12;
        boolean c=true;
        // Using unary operators
        System.out.println("Post++:"+(a++));
        System.out.println("++Pre:"+(++a));
        System.out.println("Post--:"+(b--));
        System.out.println("--Pre:"+(--b));
        System.out.println("c!:"+(!c));
    }
}
