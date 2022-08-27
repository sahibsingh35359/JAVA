package com.company;
import java.util.Scanner;
class Withdraw{
    float prev_amt;
    float with_amt;
    float left_amt;
    float dep_amt;

     public void out() {

        if (with_amt <= prev_amt)
        {
            left_amt = prev_amt - with_amt;
            System.out.println("Amount withdrawn Successfully");
            System.out.println("left amt is: " + left_amt);
        }
        else
        {
            System.out.println("ERROR!!!!!");
            System.out.println(" AMOUNT ENTERED US MORE THAN RESIDING AMOUNT");
        }
    }
   public void in()
   {
        left_amt = prev_amt + dep_amt;
        System.out.println("Amount Deposited Successfully ");
        System.out.println("New balance is: "+left_amt);
    }
}
public class ATM {

    public static void main(String[] args) {
        Withdraw w1 = new Withdraw();


        float prev_amt=550000.00f;
        int a;
        int acc_no;
        int acc_pass;
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your account number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter your password: ");
        acc_pass = sc.nextInt();
        // Scanner scpass = new Scanner(System.in);


        if (acc_no == 1234 && acc_pass == 0000) {
            w1.prev_amt= 550000.00f;
            System.out.println("Please choose a option");
            System.out.println("Money in your account is: " + w1.prev_amt);
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
          //  Scanner sc1 = new Scanner(System.in);
           float b = sc.nextInt();

            if(b == 1) {

                System.out.print("Enter amount you want to withdraw: ");
                //Scanner sc2 = new Scanner(System.in);
                w1.with_amt = sc.nextInt();
                w1.out();
            }

            else if(b == 2)
            {

                System.out.print("Money in your account is: " + w1.prev_amt);
                System.out.print("Enter amount you want to deposit: ");
                //Scanner sc2 = new Scanner(System.in);
                w1.dep_amt = sc.nextInt();
                w1.in();
            }
            else
            {
                System.out.println("Invalid code");
            }
        }
        if (acc_no == 5678 && acc_pass == 1111) {
            w1.prev_amt=100000.00f;
            System.out.println("Money in your account is: " + w1.prev_amt);
            System.out.println("Please choose a option");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
        //    Scanner sc1 = new Scanner(System.in);
              a = sc.nextInt();

            if(a == 1)
            {
                System.out.print("Enter amount you want to withdraw: ");
                //Scanner sc = new Scanner(System.in);
                w1.with_amt = sc.nextInt();
                w1.out();
            }

            else if(a == 2)
            {
                System.out.println(" Money in your account is: " + w1.prev_amt);
                System.out.print("Enter amount you want to deposit: ");
                //Scanner sc2 = new Scanner(System.in);
                w1.dep_amt = sc.nextInt();
                w1.in();
            }
            else
            {
                System.out.println("Invalid code");
            }
        }
        else{
            System.out.println("INVALID USERNAME AND PASSWORD");
        }

    }
}
