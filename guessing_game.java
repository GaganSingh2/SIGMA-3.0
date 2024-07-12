import java.util.Scanner;
import java.util.Random;

public class guessing_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generate random number between 1 and 100
        int guess;
        boolean win = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                win = true;
            }
        }
    }
}
