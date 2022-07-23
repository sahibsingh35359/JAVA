package com.company;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.print("Enter your AGE: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are become an Adult!");
                break;

            case 23:
                System.out.println("You are going to join a job!");
                break;

            case 60:
                System.out.println("You are going to be retired");
                break;

            default:
                System.out.println("Enjoy your Life!");
        }


    }
}
