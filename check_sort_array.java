package com.company;

public class check_sort_array {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 455};
        boolean issorted = true;
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i] > arr[i+1] ){
                issorted = false;
                break;
            }
        }
        if (issorted){
            System.out.println("The Array Is Sorted");
        }
        else {
            System.out.println("The Array Is Not Sorted");
        }

    }
}
