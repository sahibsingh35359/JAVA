package com.company;

import java.util.Scanner;

class library1{
    Scanner sc = new Scanner(System.in);
    String [] AvailableBooks = new String[10];
    String [] IssueBooks = new String[10];
    int n = 5;
    int  m = 0;
    public  library1(){ // constructor
        AvailableBooks[0] = "journey to be rich";
        AvailableBooks[1] = "life is cycle";
        AvailableBooks[2] = "pride of our country";
        AvailableBooks[3] = "the story of Punjab";
        AvailableBooks[4] = "highlight of Punjab 1984";
    int n = 3;
    int m = 0;
    }
    public void AddBook(){ //add book function
        if (n == 10){
            System.out.println("Library is full....!!");
        }
        else
        {
            System.out.print("Enter the name of the book: ");
            AvailableBooks[n] = sc.nextLine();
           // String s1 = sc.nextLine();
            n++;
           System.out.println("BOOK ADDED...!!");
        }
//        if (sc.equals(AvailableBooks))
//        {
//            System.out.println("BOOK ADDED...!!");
//        }
//        else {
//            System.out.println("BOOK NOT FOUND....!!");
//        }
    }

    public void AvBooks(){  //Available book function
        System.out.println("AVAILABLE BOOKS ARE: ");
        for (int i=0;i<n;i++)
        {
            System.out.println( i+1 +":"+AvailableBooks[i]);
        }

    }

    public void IssueBook()
    {  // issue book function
        AvBooks();
        System.out.print("Enter the name of the book You want to issue: ");
        String s = sc.nextLine();
        for(int j=0;j<n; j++)
        {
            if (s.equals(AvailableBooks[j]))
            {
                System.out.println("BOOK ISSUED....!!");
                IssueBooks[m]=s;
                m++;
                for (int k = j; k<n; k++) // doubtful loop
                {
                    AvailableBooks[k] = AvailableBooks[k+1];
                    n--;
                    break;
                }
            }
            else {
                System.out.println("BOOK NOT FOUND....!!");
            }
        }
    }
}
public class practice
{
    public static void main(String[] args)
    {
        library1 obj = new library1();
        Scanner s = new Scanner(System.in);
        String ch = "n";
        obj.AvBooks();
        System.out.println();
        System.out.print("You Want to ADD BOOK:(Y/N) ");
        ch = s.nextLine();

         while (ch.equals("Y")||ch.equals("y"))
        {
            obj.AddBook();
            System.out.print("You Want To Add More Books:(Y/N) ");
            ch = s.nextLine();
        }

         System.out.print("You Want to Issue Book (Y/N): ");
        ch = s.nextLine();

        while(ch.equals("Y")||ch.equals("y"))
        {
            obj.IssueBook();
            System.out.print("You Want to Issue More books:(Y/N) ");
            ch = s.nextLine();
        }

    }

}
