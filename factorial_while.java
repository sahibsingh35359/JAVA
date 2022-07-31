package com.company;

public class factorial_while {
    public static void main(String[] args) {
        int n  = 5;
        int i = 1;
  int factorial = 1;
        while (i<=n) {
            factorial *= i;
            i++;
        }
        System.out.printf("The factorial of 5 is : %d ", factorial);

        }
}
