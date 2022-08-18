package com.company;

public class reverse_pattern_method {
    static void pattern1(int n){
        for (int i=n; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        pattern1(5);
    }
}

