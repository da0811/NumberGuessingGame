package main.java;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class NumberGuessingGame {
    static int randomNum;
    static int userInput;
    public static void main(String[] args) {
        Random rand = new Random();
        randomNum = rand.nextInt(100)+1;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Guess the random number between 1 to 100: ");

        while(scnr.hasNextInt()) {
            try {
                userInput = scnr.nextInt();
            }
            catch (Exception e) {
                System.out.println("Thanks for playing.");
                System.exit(0);
            }
            System.out.println("You guessed " + userInput + ".");
            if(userInput == randomNum) {
                System.out.println("You win!");
                System.exit(0);
            }
            else if(userInput > randomNum) {
                System.out.println("The number is lower.");
            }
            else {
                System.out.println("The number is higher.");
            }
        }

    }

}
