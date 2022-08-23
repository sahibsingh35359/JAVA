package com.company;
class circle1{
    private float area;
    private float perimeter;
    private float radius;

    public void setArea(float a) {
        if (a == 22 * radius * radius / 7) {
            area = a;
        }
        else {
            System.out.println("WARNING!!! wrong area as per the radius");
        }
    }
        public void setPerimeter(float p) {
            if (p == 2 * 22 * radius / 7) {
                perimeter = p;
            } else {
                System.out.println("WARNING!!! wrong perimeter as per the radius");
            }
        }
        public void setRadius(float r) {
            radius = r;
        }
         public float getArea(){
        return area;
         }
         public float getPerimeter(){
        return perimeter;
         }
         public float getRadius(){
        return radius;
         }
    }
public class circle_setter_getter {
    public static void main(String[] args) {
    circle1 cr = new circle1();
    cr.setArea(28.26f);
    cr.setPerimeter(18.84f);
    cr.setRadius(3);
       // System.out.println(cr.getRadius());
        System.out.println(cr.getArea());
        System.out.println(cr.getPerimeter());
    }
 }


//private int radius;
//    private float Area;
//    private float Perimeter;
//
//    public void setRadius(int r){
//        radius = r;
//    }
//    public void checkArea(float a){
//        Area=3.14f*radius*radius;
//        if(Area==a)
//        {
//            System.out.println("Correct Area.");
//        }
//        else{
//            System.out.println("Incorrect Area.");
//        }
//    }
//    public void checkPerimeter(float p){
//        Perimeter = 2*3.14f*radius;
//        if(Perimeter==p)
//        {
//            System.out.println("Correct Perimeter.");
//        }
//        else{
//            System.out.println("Incorrect Perimeter.");
//        }
//    }
//}
//public class circle_setter_getter {
//    public static void main(String[] args){
//        circle1 ci= new circle1();
//        ci.setRadius(3);
//        ci.checkArea(28.26f);
//        ci.checkPerimeter(18.84f);
//    }
//}
//
//

