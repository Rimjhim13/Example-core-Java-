package com.allexample.constructor;

public class SuperClass {
    int x;
    int y;
    {
        this.x=10;
        this.y=20;
    }
    SuperClass(){
        System.out.println(x);
        System.out.println(y);
    }
}
