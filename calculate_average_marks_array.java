package com.company;

public class calculate_average_marks_array {
    public static void main(String[] args) {
        int[] marks = {45, 65 , 95, 96, 98, 93};
        int sum = 0;
        for (int element:marks) {
            sum = sum + element;
        }
        System.out.println("The average marks of Student is: "+ sum/marks.length);
    }
}
