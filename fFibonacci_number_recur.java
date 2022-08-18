package com.company;

public class fFibonacci_number_recur {
    static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else {
            int fib = fibonacci(x - 2) + fibonacci(x - 1);
            return fib;
        }
    }

    public static void main(String[] args) {
        System.out.println("The fibonacci series");
        for(int i=0;i<=10;i++){
            System.out.print(fibonacci(i)+"  ");

        }

    }
}





