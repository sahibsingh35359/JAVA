package com.company;

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling Kanav...");
    }
}
public class class_with_multi_methods {
    public static void main(String[] args) {

        cellphone apple = new cellphone();
        apple.call();
        apple.ring();
        apple.vibrate();
    }
}
