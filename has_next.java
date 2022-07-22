package com.company;

import java.util.Scanner;

public class has_next {
    public static void main(String[] args) {
        System.out.println("What is your number ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}