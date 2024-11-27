package com.allexample.abstractEx;
//in Abstract class have-abstract method,static ,instance method
abstract class Abstract2 {

        abstract public void show();

        static void show1(){
            System.out.println("static show method");
        }
        public void show2(){
            System.out.println("normal method");
        }//we dont use directly by createing object

    }
