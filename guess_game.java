package com.company;
/*used constructor to generate random number
// used setNum() to set number
// used isCorrect() method to check
// used Counter() to count number of guesses
*/
 import java.util.Scanner;

class Game{
    int userNumber;
    int compNumber;
    int counter = 0;
    public Game()
    {
        compNumber = (int)(Math.random()*100);
     //   System.out.println(compNumber);
    }
    public void setNum(int n){
        userNumber = n;
    }
    public int isCorrect(){
        if(userNumber > compNumber) return -1;
        else if(userNumber < compNumber) return 1;
        else return 0;
    }
    public void Counter(){
        counter++;
    }
}

public class guess_game {
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            System.out.print("Enter a number between 1-100: ");
            n = sc.nextInt();
            obj.setNum(n);

            if(obj.isCorrect() == 0){
                obj.Counter();
                System.out.println("Congratulations, You've guessed the number.");
                System.out.println("Number of Guesses: " + (obj.counter));
                break;
            }
            else if(obj.isCorrect() == 1){
                obj.Counter();
                System.out.println("Higher number please!");
            }
            else if(obj.isCorrect() == -1){
                obj.Counter();
                System.out.println("Lower number please!");
            }
        }
    }
}
