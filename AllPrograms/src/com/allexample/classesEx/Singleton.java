package com.allexample.classesEx;

public class Singleton {
    private static final Singleton instance=new Singleton();
    private Singleton(){}
 public static Singleton method(){
        return instance;
    }
}
