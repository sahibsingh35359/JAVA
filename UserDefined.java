import java.util.Scanner;

public class UserDefined {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number 1");
         int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("Enter number 3");
        int c=sc.nextInt();
        int CGPA=(a+b+c)/30;
        System.out.println("The CGPA is");
        System.out.print(CGPA);



    }
}
