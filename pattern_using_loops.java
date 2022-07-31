package com.company;

public class pattern_using_loops {
    public static void main(String[] args) {
        //int n =4;

        // using for loop

//        for (int i = n; i>0; i--){
//            for (int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //using while loop
        int i=4;
        while (i>=0){
            int j = i;
            i--;
            while (j>0){
                j--;
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
