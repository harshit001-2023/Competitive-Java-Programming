import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // --- 1. SETUP ---
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Computer thinks of a number from 1 to 100
        int secretNumber = random.nextInt(100) + 1;
        int userGuess = 0; // Initialize user's guess to a number that can't be right

        System.out.println("--- Number Guessing Game ---");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // --- 2. THE GAME LOOP ---
        // Loop as long as the user's guess is not the secret number
        while (userGuess != secretNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); // Read the user's guess

            // Give hints
            if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            }
        }

        // --- 3. END OF GAME ---
        // This line only runs after the loop is finished (when the guess is correct)
        System.out.println("You guessed it! The secret number was " + secretNumber);
    }
}