package com.allexample.encapsulation;
//not purely encapsulated class
// encapsulation with method ovverloding

public class EncapsulationEx4 {
    public static void main(String ar[]){
        Parent4 p=new Parent4();

        p.setX(10);
        System.out.println(p.getX());
        System.out.println(p.sum(10,20));
        System.out.println(p.sum(10,20,30));



    }
}
