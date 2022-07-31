package com.company;

public class max_ele_array {
    public static void main(String[] args) {
        int [] arr = {451, 95, 455, 655, 320, 366 };
        int max = 0;
        for (int element:arr){
            if (element>max){
                max = element;

            }
        }
        System.out.println("The maximum value in this array is : " +max);
    }
}
