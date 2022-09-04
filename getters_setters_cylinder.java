package com.company;
class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
      radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }
    public double suraface(){
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
    }
    public  double volume(){
        return 3.14 * radius * radius * height;
    }
}

public class getters_setters_cylinder {
    public static void main(String[] args) {
        cylinder cy = new cylinder();

        cy.setHeight(12);
        System.out.println(cy.getHeight());

        cy.setRadius(9);
        System.out.println(cy.getHeight());
        System.out.println(cy.suraface());
        System.out.println(cy.volume());

    }
}
