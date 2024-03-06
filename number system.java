/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1; // Minimum value for the range
        int maxRange = 100; // Maximum value for the range
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange; // Generate a random number within the range
        
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
            } else if (guess < targetNumber) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }
        }
        
        scanner.close();
    }
}
