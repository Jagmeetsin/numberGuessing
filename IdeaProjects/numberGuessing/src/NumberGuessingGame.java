import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        int guess;
        System.out.println("--x--Number guessing game--x--");
        System.out.println("--x-- Guess a number between 1 and 100 --x--");
        while(!hasGuessedCorrectly){
            System.out.print("Enter the guess: ");
            guess = sc.nextInt();
            numberOfTries++;
            if(guess < numberToGuess){
                System.out.println("Too low ! try again");
            }
            else if(guess > numberToGuess){
                System.out.println("Too high ! try again");
            }
            else{
                hasGuessedCorrectly = true;
                System.out.println("Congratulation");
                System.out.println("It took you "+ numberOfTries + " tries");
            }
        }
    }
}
