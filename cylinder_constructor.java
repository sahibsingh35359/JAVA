package com.company;
class cylinder1 {
     int radius;
     int height;

    public cylinder1(int r, int h) {
        radius = r;
        height = h;
    }
public void setradius(int p){
        radius = p;
}
public int getRadius(){
        return radius;
}
public void setheight(int q){
        height = q;
}
public int  getHeight(){
        return height;
}

}
public class cylinder_constructor {
    public static void main(String[] args) {
cylinder1 cy1 = new cylinder1(12,9);
        System.out.println(cy1.getRadius());
        System.out.println(cy1.getHeight());
    }
}
