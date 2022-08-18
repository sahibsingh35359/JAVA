package com.company;

public class recursion {
//// recursive approach
    static int factorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        //iterative approach
        static int factorial_iterative ( int n){
            if (n == 0 || n == 1) {
                return 1;

            } else {
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    product *= i;

                }
                return product;
            }
        }

        public static void main (String[]args){
            int m = 5;
            System.out.println("the value of m is : " + factorial(m));
            System.out.println("the value of m is : " + factorial_iterative(m));
        }
    }