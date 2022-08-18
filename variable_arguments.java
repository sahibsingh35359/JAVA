package com.company;

public class variable_arguments {
    static int sum(int...arr){
        int result = 0;
        for(int a:arr){
            result  += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The value of 4 and 5 is :" +sum(4, 5));
        System.out.println("The value of 4 , 5, 56 is: " +sum(4 ,5 ,56));
        System.out.println("The value of 4 , 5, 59 ,60 is: " +sum(4 ,5 ,59, 60 ));
        System.out.println("The sum of nothing is :" +sum());
    }
}
