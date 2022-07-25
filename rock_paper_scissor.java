package com.company;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);


        System.out.println("Rock = 0 ");
        System.out.println("paper  = 1 ");
        System.out.println("scissor = 2 ");
        System.out.println("please Enter your choice here:");
        byte number = sc.nextByte();




        Random rnum  = new Random();

        int  random  = rnum.nextInt(3);


        //rock = 0
        //paper = 1
        //scissor = 2


        switch (random) {
            case 0:
                System.out.println("pc select rock");
                break;

            case 1:
                System.out.println("pc select paper");
                break;

            case 2:
                System.out.println("pc select scissor");
                break;

            default:
                break;
        }

        switch (number) {
            case 0:
                System.out.println("you select rock");
                break;

            case 1:
                System.out.println("you select paper");
                break;

            case 2:
                System.out.println("you select scissor");
                break;

            default:

                break;
        }


        if(random == number )
        {
            System.out.println("this is tie ");
        }

        else if (random == 2 && number ==1 ) {
            System.out.println("you lost");

        }
        else if (random == 1 && number == 0) {
            System.out.println("you lost");

        }

        else if( random == 0 && number == 2)
        {
            System.out.println("you lost");

        }


        else if (random == 1 && number == 2) {
            System.out.println("you win ");

        }

        else if (random == 0 && number == 1) {
            System.out.println("you win ");


        }

        else if (random == 2 && number == 0) {
            System.out.println("you won");

        }
    }
}
