package com.company;
class mca{
    int number;
    String name;

    public mca(){
        number=10;
        name="HELLO EVERYONE";

    }
    public mca(mca ref){
        number= ref.number;
        name=ref.name;
    }

    public void setNumber(int n){
        number = n;
    }
    public int getNumber(){
        return number;
    }
    public void setName(String i){
        name = i;
    }
    public String getName(){
        return name;
    }

}

public class copy_constructor {
    public static void main(String[] args) {
        mca mcs1 = new mca();
        mca msc2 = new mca(mcs1);
        System.out.println(msc2.getNumber());
        System.out.println(msc2.getName());


    }
}
