package com.allexample.encapsulation;
//encapsulation Prog using geter seter
public class EncapsulationEx2 {
    public static void main(String ar[]) {
        Parent2 p = new Parent2();
        //p.x=10;
        //System.out.println(p.x);
        p.setX(10);
        System.out.println(p.getX());

    }
}
