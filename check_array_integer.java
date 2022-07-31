package com.company;

public class check_array_integer {
    public static void main(String[] args) {
        float[] flats = {10.7f, 20.9f, 30.6f, 40.4f, 50.3f};
        float num = 30.6f;
        boolean IsInArray = false;
        for (float element : flats) {
            if (num == element) {
                IsInArray = true;
                break;
            }
        }
        if (IsInArray) {
            System.out.println("The Number is Preset in the Array");
        }
        else {
            System.out.println("The Number Is Not Present In The Array");
        }
    }
}