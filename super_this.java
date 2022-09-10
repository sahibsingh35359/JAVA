package com.company;

class MBA
{
    int a;

    MBA(int a)
    {
        this.a =  a;
    }

    public int getA()
    {
        return a;
    }

}

class  MA extends MBA
{
  public MA(int c)
  {
     super(c);
     System.out.println("I am a constructor buddy!!");
     System.out.println(c);
  }
}
public class super_this {
    public static void main(String[] args) {
    //MBA mba = new MBA(65);
      MA ma = new MA(5);
       // System.out.println(mba.getA());
    }
}
