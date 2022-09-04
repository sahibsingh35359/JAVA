package com.company;

import java.util.Scanner;

class abc1{
    public void add(float x, float y) { System.out.println("The result is : " + (x + y)); }
    }
    class abc2{
        public void subtract(float x, float y){
            System.out.println("the result is: "+(x-y));
        }
    }
    class abc3{
        public void multiply(float x, float y ){
            System.out.println("the result is: "+(x*y));
        }
    }
    class abc4{
        public void divide(float x, float y){
            System.out.println("the result is: "+(x/y));
        }
    }

public class calculator {
    public static void main(String[] args) {
      //  abc1 bca = new abc1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
       float firstNumber =  sc.nextInt();

        System.out.print("Enter your second number: ");
        float secondNumber = sc.nextInt();

        System.out.println();

        System.out.println("ADD +");
        System.out.println("Subtract -");
        System.out.println("Multiply *");
        System.out.println("divide /");

        System.out.print("Enter your symbol: ");
        String character = sc.next();

        switch (character){
            case "+":
                new abc1().add(firstNumber,secondNumber);
                break;
            case "-":
                new abc2().subtract(firstNumber,secondNumber);
                break;
            case "*":
                new abc3().multiply(firstNumber,secondNumber);
                break;
            case "/":
                new abc4().divide(firstNumber,secondNumber);
                break;
            default:
                System.out.println("INVALID SYMBOL");
                break;
        }
    }
}
