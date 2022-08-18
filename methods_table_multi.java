package com.company;

public class methods_table_multi {
    static void multiplication (int n){
        for (int i=1; i<=10; i++){
            System.out.format("\n%d X %d = %d", n, i, i*n);
        }
    }

    public static void main(String[] args) {
        multiplication(6);
    }
}
