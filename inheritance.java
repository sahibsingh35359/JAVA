package com.company;
class animal{
    int x;

    public int getX() {
        System.out.println("Iam setting X now");
        return x;
    }

    public void setX(int s) {
        x = s;
    }
}


class dog extends animal{
    int y;

    public int getY() {
        System.out.println("I am setting Y now ");
        return y;
    }

    public void setY(int t) {
        y = t;
    }
}

public class inheritance {
    public static void main(String[] args) {
        animal b = new animal();
        b.setX(54);
        System.out.println(b.getX());

        dog d = new dog();
          d.setY(97);
          System.out.println(d.getY());
    }
}
