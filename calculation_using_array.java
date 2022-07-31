package com.company;

public class calculation_using_array {
    public static void main(String[] args) {
        float [] flats = {10.7f, 20.9f ,30.6f, 40.4f, 50.3f };
        float sum  = 0;
        for(float element:flats) {
            sum = sum + element;
        }
            System.out.println("The Sum of Float numbers IS : " + sum);
           // System.out.println(sum);



    }
}
