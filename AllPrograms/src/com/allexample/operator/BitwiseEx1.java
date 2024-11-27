package com.allexample.operator;

public class BitwiseEx1 {
    public static void main(String ar[]){
        int a=10;
        int b =20;
        System.out.println("a&b:"+(a&b));
        System.out.println("x|y:"+(a|b));//t
        System.out.println("x^z:"+(a^b));
        System.out.println("~a:"+(~a));
        System.out.println("a<<2:"+(a<<2));
        System.out.println("a>>1:"+(a>>1));
        System.out.println("a>>>1:"+(a>>>1));
    }
}
