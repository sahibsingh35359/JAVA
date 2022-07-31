package com.company;

public class min_ele_array {
    public static void main(String[] args) {
        int [] arr = {451, 95, 455, 655, 320, 366 };
        int min = Integer.MAX_VALUE;
        for (int element:arr){
            if (element < min){
                min = element;

            }
        }
        System.out.println("The maximum value in this array is : " +min);
    }
}



