package com.allexample.encapsulation;

public class Parent1 {
    private int x;
    private int y;
    void get(int a,int b){
        x=a;
        y=b;

    }
    void show(){
        System.out.println("x="+x +" "+"y="+y);
        //System.out.println("y="+y);
    }
}
