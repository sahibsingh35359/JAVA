package com.company;

public class average_varargs {
    static int Avg(int ...arr){
        float result=0;

        for(float a: arr){
            result += a;
        }
        float R = result/arr.length;
        System.out.println("The result of the average is " +R);
        return 0;
    }

    public static void main(String[] args){
        Avg(10 ,20, 30, 40, 50 );
    }
}
