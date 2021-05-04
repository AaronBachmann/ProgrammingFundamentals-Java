import java.util.*;
// Aaron Bachmann

public class RandomGuessingProgram {

    public static void main(String[] args) {

        final int LOWER_RANGE = 1;
        final int HIGHER_RANGE = 100;
        int currentMidPoint;
        char userResponse;
        boolean gameOver = false;

        // Create NumberGuesser object
        RandomNumberGuesser guesser = new RandomNumberGuesser(LOWER_RANGE, HIGHER_RANGE);
        //NumberGuesser g = new NumberGuesser(LOWER_RANGE, HIGHER_RANGE);

        // While game is not over play the game
        do {
            guesser.reset();
            //g.reset();
            System.out.println("Guess a number between 1 and 100.");
            try {
                do {
                    currentMidPoint = guesser.getCurrentGuess();
                    //currentMidPoint = g.getCurrentGuess();

                    System.out.print("Is it " + currentMidPoint + "?" + "\t" + "(h,l,c): ");
                    Scanner keyboard = new Scanner(System.in);
                    userResponse = keyboard.next().charAt(0);

                    // If user chooses higher call higher() method, if user chooses lower call lower() method
                    if (userResponse == 'h') {
                        //g.higher();
                        guesser.higher();
                    } else if (userResponse == 'l') {
                        //g.lower();
                        guesser.lower();
                    }

                } while (userResponse != 'c');
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // if the number is correct the program asks if the user would like to play again or exits
            System.out.print("Do you want to play again? (y/n): ");
            Scanner keyboard = new Scanner(System.in);
            char answer = keyboard.next().charAt(0);

            if (answer == 'y') {
                gameOver = false;
            } else {
                gameOver = true;
                System.out.println("Game Over! Goodbye");
                System.exit(0);
            }


        } while (!gameOver);
    }
}








