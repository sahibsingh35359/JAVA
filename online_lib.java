package com.company;

import java.util.Scanner;
class library
{
    Scanner sc = new Scanner(System.in);
    String [] avbooks = new String[10];
    String [] isdbooks = new String[10];
    int n = 4;
    int m = 0;

   public library(){
        avbooks[0]="Computer Networks";
        avbooks[1]="Java Programming";
        avbooks[2]="Discrete Mathematics";
        avbooks[3]="Hypertext Preprocessor(PHP)";
         int n = 3;
         int m = 0;
    }
    public void addbook ()
    {
        if(n == 10)
        {
            System.out.println("Library full ...");
        }
        else
        {
            System.out.println("Enter the name of book");
            avbooks[n]=sc.nextLine();
            n++;
            System.out.println("BOOK ADDED");
        }
    }
    void avbook()
    {
        System.out.println("Available books are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(i+1+" :"+avbooks[i]);
        }
    }
    void issuebooks()
    {
        avbook();
        System.out.println("Enter the name of book you want to issue: ");
        String s = sc.nextLine();
        for(int j=0;j<n;j++)
        {
            if(s.equals(avbooks[j]))
            {
                System.out.println("BOOK ISSUED....!!");
                isdbooks[m]=s;
                m++;
                for(int k=j;k<n;k++)
                {
                    avbooks[k]=avbooks[k+1];
                    n--;
                    break;

                }

            }
            else{
                System.out.println("BOOK NOT FOUND YET");
            }
        }
    }
}
public class online_lib {

    public static void main(String[] args)
    {
        library obj = new library();
        Scanner s = new Scanner(System.in);
        String ch = "n";
        obj.avbook();
        System.out.println("Want to add book(Y/N)");
        ch = s.next();
        while(ch.equals("Y")||ch.equals("y"))
        {
            obj.addbook();
            System.out.println("Want to add more book(Y/N)");
            ch=s.next();
        }
        System.out.println("Want to issue book(Y/N)");
        ch=s.next();
        while(ch.equals("Y")||ch.equals("y"))
        {
            obj.issuebooks();
            System.out.println("Want to issue more book(Y/N)");
            ch=s.next();
        }


    }
}

