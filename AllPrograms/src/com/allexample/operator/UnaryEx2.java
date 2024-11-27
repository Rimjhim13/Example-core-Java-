package com.allexample.operator;

public class UnaryEx2 {
    public static void main(String ar[]){
        int a=10;
//int y=a+++a; run
//int y=a++++a; error
//int y=a++ + ++a; run
//int y=a+++ +a; run
        int y=a++ +a;
        System.out.println("a:"+a);//t
        System.out.println("y:"+y);//t
    }
}
