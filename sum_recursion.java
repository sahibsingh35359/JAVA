package com.company;

public class sum_recursion {
    static int Sumrec(int n){
        if (n ==1){
            return 1;

        }
        return n + Sumrec(n-1);
    }

    public static void main(String[] args) {

        int c = Sumrec(4);
        System.out.println(c);
    }
}
