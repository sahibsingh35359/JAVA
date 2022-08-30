package com.company;
class BCA{
    int number;
    String name;
    int salary;

    public BCA(int x,String y,int z){
         number = x;
         name = y;
         salary = z;
    }

}
public class constructor_overiding {
    public static void main(String[] args) {
        BCA b1 = new BCA(54,"AMBER",5000);
        System.out.println(b1);

    }
}
