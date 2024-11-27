package com.allexample.classesEx;

public class SingletonEx {
    public static void main(String ar[]){
        Singleton s1=  Singleton.method();
        Singleton s2=  Singleton.method();
        if(s1==s2){
            System.out.println("Same object");
        }

    }
}
