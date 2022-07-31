package com.company;

public class break_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("hello Everyone!");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;

            }
        }
    }
}