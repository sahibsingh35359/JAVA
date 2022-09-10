package com.company;
class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("Apka swagat hai ");
    }
    public void name(){
        System.out.println("My name is java in class two");
    }
}
public class dynamic_method_Dispatch {
    public static void main(String[] args) {
//        phone obj  = new phone(); // allowed

//        smartphone ob1 = new smartphone(); //allowed
//        obj.name();

        phone obj = new smartphone(); //allowed

     // smartphone obj1 = new phone(); // not allowed
        obj.greet();
        obj.name();
        // obj.swagat();  // this is also not allowed

    }
}
