import java.util.Arrays;
import java.util.Scanner;

// Aaron Bachmann

// Create public class PokerHands
public class PokerHands {
    public static void main(String args[]) {

        final int HAND_SIZE = 5;                 // Set the number of cards per hand
        int[] hand = new int[HAND_SIZE];         // Create an array to hold user-entered cards

        // User prompt to enter card choices 2 - 9
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
        Scanner keyboard = new Scanner(System.in);

        // For loop to iterate through the cards 1 - 5 and display the results
        for (int i = 0; i < 5; i++) {
            System.out.print("Card " + (i + 1) + ": ");
            hand[i] = keyboard.nextInt();
        }

        // Sort the user-entered hand before it is evaluated
        Arrays.sort(hand);

        // If-Else statement that uses methods to evaluate the user-entered hand array
        if (containsFourOfaKind(hand)) {
            System.out.println("Four of a Kind!");
        } else if (containsFullHouse(hand)) {
            System.out.println("Full House!");
        } else if (containsStraight(hand)) {
            System.out.println("Straight!");
        } else if (containsTwoPair(hand)) {
            System.out.print("Two Pair!");
        } else if (containsThreeOfaKind(hand)) {
            System.out.println("Three of a Kind!");
        } else if (containsPair(hand)){
            System.out.println("Pair!");
        } else {
            System.out.println("High Card!");
        }
    }
    // Method that checks for two of the same card
    public static boolean containsPair(int hand[]) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int a = i + 1; a < hand.length; a++) {
                if (hand[i] == hand[a]) {
                    count += 1;
                }
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }

    // Method that checks for three of the same card
    public static boolean containsThreeOfaKind(int hand[]) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int a = i + 1; a < hand.length; a++) {
                if (hand[i] == hand[a]) {
                    count += 1;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    // Method that checks for four of the same card
    public static boolean containsFourOfaKind(int hand[]) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;
            for (int a = i + 1; a < hand.length; a++) {
                if (hand[i] == hand[a]) {
                    count += 1;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    // Method that checks for two of the same card of one number, and three of the same card of another number
    public static boolean containsFullHouse(int hand[]) {
        if (hand[0] == hand[1] && hand[3] == hand[4]) {
            if (hand[0] == hand[2] || hand[4] == hand[2]) {
                return true;
            }
        }
        return false;
    }
    // Method that checks for two pairs of two different numbers
    public static boolean containsTwoPair(int hand[]) {
        if (hand[0] == hand[1] && hand[3] == hand[4]) {
            return true;
        }
        if (hand[1] == hand[2] && hand[3] == hand[4]) {
            return true;
        }
        if (hand[0] == hand[1] && hand[2] == hand[3]) {
            return true;
        }
        return false;
        }

    // Method that checks for five consecutive numbers in any order (after sorting)
    public static boolean containsStraight(int hand[]) {
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i] != hand[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }

}
