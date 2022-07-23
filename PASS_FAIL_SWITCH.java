package com.company;

import java.util.Scanner;

public class PASS_FAIL_SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English");
        int english = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of Science");
        int science = sc.nextInt();
        float avg =(english + maths + science)/3.0f;
        System.out.print("Total MARKS : ");
        System.out.println(avg);
        if(avg>=44 &&english>=33 &&maths>=33 &&science>=33){
            System.out.println("CONGRATULATIONS!, YOU ARE PROMOTED!");
        }
        else{
            System.out.println("SORRY! YOU ARE NOT PROMOTED");
        }
    }
}
