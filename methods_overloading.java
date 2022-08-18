package com.company;

public class methods_overloading {
    static void foo(){
        System.out.println("Good Morning");

    }
    static void foo(int a){
        System.out.println("Hello "+ a +" Everyone");
    }
    static void foo(int a ,int b){
        System.out.println("Hello " + a +" Everyone");
        System.out.println("Hello " + b +" Good Morning" );

    }

    public static void main(String[] args) {
        foo();
        foo(300);
        foo(500,400);

    }
}
