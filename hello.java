package com.company;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.print("What is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("HEllo "  +  name  +  " have a good day");
    }
}
