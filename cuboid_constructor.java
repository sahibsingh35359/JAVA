package com.company;
class cuboid{
    int length;
    int breadth;
    int height;

    public cuboid(int a, int b, int c){
        length = a ;
        breadth = b ;
        height = c ;
    }

    public int volume(){
        return length*breadth*height;
    }

}
public class cuboid_constructor {
    public static void main(String[] args) {
        cuboid cc = new cuboid(15,2,2);
        int a = cc.volume();
        System.out.println("The volume of the cuboid is: "+a);
    }
}
