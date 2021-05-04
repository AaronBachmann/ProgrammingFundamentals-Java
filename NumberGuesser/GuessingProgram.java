import java.util.*;

public class GuessingProgram {

    public static void main(String[] args) {

        final int LOWER_RANGE = 1;
        final int HIGHER_RANGE = 100;
        int currentMidPoint;
        char userResponse;
        boolean gameOver = false;

        // Create NumberGuesser object
        NumberGuesser guesser = new NumberGuesser(LOWER_RANGE, HIGHER_RANGE);
        // Welcome the player to the game
        System.out.println("Guess a number between 1 and 100.");

        // While game is not over play the game
        while (!gameOver) {

            // Get the current midpoint by calling getCurrentGuess() method
            currentMidPoint = guesser.getCurrentGuess();
            // Get user input with new Scanner() method
            System.out.print("Is it " + currentMidPoint + "?" + "\t" + "(h,l,c): ");
            Scanner keyboard = new Scanner(System.in);
            userResponse = keyboard.next().charAt(0);

            // If-else statement that evaluates user response (higher or lower)
            // If user chooses higher call higher() method, if user chooses lower call lower() method
            if (userResponse == 'h' || userResponse == 'H') {
                guesser.higher();
            } else if (userResponse == 'l' || userResponse == 'L') {
                guesser.lower();
            } else if (userResponse == 'c' || userResponse == 'C') {
                System.out.println("That is correct!");
                guesser.reset();
                {
                    // if the number is correct the program asks if the user would like to play again or exits
                    System.out.print("Great! Do you want to play again? (y/n): ");
                    char answer = keyboard.next().charAt(0);

                    if (answer == 'y' || answer == 'Y') {
                        gameOver = false;
                        System.out.println("Guess a number between 1 and 100.");
                        guesser.reset();
                    } else {
                        gameOver = true;
                        System.out.println("Game Over! Goodbye");
                        System.exit(0);
                    }

                }
            }
        }

    }
}