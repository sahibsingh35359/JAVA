package com.company;
class BCA
{
    int length;
    int breadth;
    int height;

    public BCA(int x, int y,int z){
         length = x;
         breadth = y;
         height = z;
    }
    public BCA(int l){
    length = l;
    breadth = l;
    height = l;
    }

    public void mm(){
        int bb = length*breadth*height;
        System.out.println("The ANSWER IS: "+bb);
    }

}
public class constructor_overloading {
    public static void main(String[] args) {
        BCA b1 = new BCA(4,1,2);

        b1.mm();
       // System.out.println(b1);
       // System.out.println(b1);

    }
}
