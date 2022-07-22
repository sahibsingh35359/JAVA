package com.company;

import java.util.Scanner;

public class conditional_statements_if_else {
    public static void main(String[] args) {
        //int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        int age = sc.nextInt();
        if (age < 20){
            System.out.println("You are not Eligible");
        }
        else
            System.out.println("You are eligible");
    }
}
