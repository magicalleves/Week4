import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a simple number guessing game in Java where the user has to guess a randomly generated number between 1 and 100
        /*
        Setup:
            Create a new Java class named ‘Main’.
            Import the necessary classes: ‘java.util.Random’ and ‘java.util.Scanner’.
        Generate a Random Number:
            Use the ‘Random’ class to generate a random number between 1 and 100.
        User Input:
            Use the ‘Scanner’ class to read user input from the console.
        Game Loop:
            Implement a loop that continues until the user guesses the correct number.
            Inside the loop, prompt the user to enter their guess.
            Compare the user's guess to the generated random number and provide feedback:
            If the guess is too low, print "Too low! Try again."
            If the guess is too high, print "Too high! Try again."
            If the guess is correct, print "Congratulations! You guessed the correct number in X attempts." and exit the loop.
         */

        int count = 0;

        int randomNumber = new Random().nextInt(100);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");
        

        while (true) {

            Scanner askUserForGuessedNumber = new Scanner(System.in);
            System.out.println("Enter your guess: ");

            int guessedNumber = askUserForGuessedNumber.nextInt();

            if (guessedNumber > randomNumber) {
                System.out.println("Too high! Try again.");
                count = count + 1;
            } else if (guessedNumber < randomNumber) {
                System.out.println("Too low! Try again.");
                count = count + 1;
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + count + " times!");
            }

            if (guessedNumber == randomNumber) {
                break;
            } else {
                continue;
            }


        }
    }
}