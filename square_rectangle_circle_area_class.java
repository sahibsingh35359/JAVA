package com.company;

class square{
    int side;

    public int area() {
        return side*side;
    }

    public int perimeter(){
        return 4 * side;
    }
}
class rectangle{
    int length, breadth;
    public int area(int l, int b){
        length = l;
        breadth = b;
        return l*b;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}
class circle{
    int radius;
    public float area(int r){
        radius = r;
        return (22/7)*r*r;
    }
    public float perimeter(){
        return 2*(22/7)* radius;
    }
}
public class square_rectangle_circle_area_class {
    public static void main(String[] args) {
square sc = new square();
rectangle rec = new rectangle();
circle cir = new circle();
sc.side = 3;
        System.out.println(sc.area());
        System.out.println(sc.perimeter());
        //rec.area(4,5); RECTANGLE
        System.out.println(rec.area(4,5));
        System.out.println(rec.perimeter());
         // CIRCLE
        System.out.println(cir.area(7));
        System.out.println(cir.perimeter());
    }
}
