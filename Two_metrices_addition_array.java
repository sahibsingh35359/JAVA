package com.company;

public class Two_metrices_addition_array {
    public static void main(String[] args) {
        int[] [] mat1 = {{10,20,30},
                        {6,12,18}};

        int[] [] mat2 = {{10,20,30},
                        {6,12,18}};

        int[] [] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");

            }
            System.out.println(""); // Prints a new line
        }


    }
}
