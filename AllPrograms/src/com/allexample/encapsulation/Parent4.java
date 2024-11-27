package com.allexample.encapsulation;

public class Parent4 {
    private int x;
    int getX(){
        return x;
    }
    void setX(int n){
        this.x=n;
    }
    int sum(int a,int b ){
        return a+b;
    }
    //method overload
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
