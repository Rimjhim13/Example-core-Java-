package com.allexample.encapsulation;

public class Parent3 {
    private String DeviceName;

    String getDevice(){
        return this.DeviceName;
    }
    void setDevice(String name){
        this.DeviceName=name +" is a Device";
    }
}
