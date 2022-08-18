package com.company;


public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c;
        c = logic(a , b);
        System.out.println(c);
        int a1 = 54;
        int b1 = 72;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);

    }


}
