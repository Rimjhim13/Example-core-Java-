package com.allexample.polymorphysim;
/*polymorphism -its allow to do same fuction in different  different way.
type of Polymorphism-Method overloading(Compile),Method Overrideing(run)
 Method overloading Ex-*/
public class overloadingEx1
{
    public static void main(String ar[]){
        SuperEx1 m=new SuperEx1();
        m.show(1,2,3);
        m.show(2,3);
        m.show(1);

    }
}
