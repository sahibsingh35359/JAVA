package com.company;

class base{
    int y;

    public base(){
        System.out.println("HEY I am a constructor");
    }
    public base(int x){
        System.out.println("HEY!! I am an overloaded  constructor with value x as: " +x);
    }
}


class derived extends base{
    int z;

    public derived() {
        //super(5);  //when this keyword is used the overloaded constructor with value is executed "of base class"
        System.out.println("HEY I am a derived constructor");
    }

        public derived(int x, int y){
           // System.out.println("I am an overloaded  derived constructor: "+x);
            super(x);
            System.out.println("HEY!! I am an overloaded  derived constructor: "+y);

        }
}

class childofderived extends derived{

    public childofderived(){
        System.out.println("HEY I am a child of derived constructor");
    }
    public childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("HEY!! iam an overloaded constructor of child of derived class:" +z);
    }
}


public class inheritance_with_constructor {
    public static void main(String[] args) {
    // base bb = new base();
    //derived dd = new derived(4, 16);
    childofderived ch = new childofderived(14, 15 ,16);
    }
}
