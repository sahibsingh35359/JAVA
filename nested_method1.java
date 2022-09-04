package com.company;

import java.util.Scanner;

  class nested_method {
     public int perimeter(int l, int b) {
         int pr = 12 * (l + b);
         return pr;
     }

     public int area(int l, int b) {
         int pr = perimeter(5, 5);
         System.out.println(pr);
         int ar = 6 * l * b;
         return ar;
     }

     public int volume(int l, int b, int h) {
         int ar = area(9, 9);
         System.out.println(ar);
         int vol;
         vol = l * b * h;
         return vol;
     }

 }
 public class nested_method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        int l = sc.nextInt();
        System.out.println("Enter the value of breadth: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of height: ");
        int h = sc.nextInt();
        nested_method nc = new nested_method();
        int aa = nc.volume(5,4,3);
        System.out.println(aa);

    }
}