package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class array {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 25;
        marks[1] = 30;
        marks[2] = 35;
        marks[3] = 40;
        marks[4] = 45;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // for displaying length
      //  System.out.println(marks.length);

        //using for loop
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Reverse Order");
        //reverse order
        for (int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
