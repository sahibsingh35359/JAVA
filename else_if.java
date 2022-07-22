package com.company;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        System.out.print("Enter your AGE: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi-Experienced");
        }
        else if (age>36){
            System.out.println("You are less experienced");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE");
        }
    }
}
