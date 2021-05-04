import java.util.Scanner;
// Aaron Bachmann

public class StringProcessorProgram {

    public static void main(String[] args) {

        String userInput;
        char choice;

        // Create new Scanner object
        Scanner keyboard = new Scanner(System.in);

        do
            {
                // Ask for user-input
                System.out.print("Enter a line of text: ");
                userInput = keyboard.nextLine();

                // Create new StringProcessor object
                StringProcessor stringer = new StringProcessor(userInput);

                System.out.println("words: " + stringer.wordCount());
                System.out.println("uppercase letters: " + stringer.UpperCaseCount());
                System.out.println("digits: " + stringer.digitCount());
                System.out.println("digit words: " + stringer.digitWordCount());
                System.out.println("line with whitespace removed: " + stringer.getNoSpaceString());
                System.out.println("line with vowels replaced: " + stringer.getNoVowelString());
                System.out.println("line with digit words replaced: " + stringer.getNoDigitWordString());

                // Ask if user would like to enter another line
                System.out.print("Do you want to enter a new line? (y/n): ");
                String answer = keyboard.nextLine();
                choice = answer.charAt(0);


            } while (Character.toLowerCase(choice) == 'y');
    }
}