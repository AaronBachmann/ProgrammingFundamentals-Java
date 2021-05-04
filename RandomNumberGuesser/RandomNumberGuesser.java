import java.util.*;
// Aaron Bachmann

public class RandomNumberGuesser extends NumberGuesser {
    private int randMidPoint;
    private boolean isRandGuess;
    private Random randGuess;
    private NumberGuesser guesser;

    /** Constructor sets the lower bound and upper bound of range with random assignment.
     * @param lower The lower bound of the range.
     * @param higher The upper bound of the range.
     */
    public RandomNumberGuesser(int lower, int higher) {
        super(lower, higher);
        isRandGuess = true;
        randGuess = new Random();

    }

    /** The getCurrentGuess method overrides the superclass getCurrentGuess method.
     * @return The random midpoint.
     */
    @Override
    public int getCurrentGuess() {
         if (isRandGuess) {
            randMidPoint = (lowerNumber + randGuess.nextInt(upperNumber - lowerNumber + 1));
            isRandGuess = false;
         }

        return randMidPoint;
    }

    /** The lower method overrides the superclass lower method. If random is true,
     * a random lower number will be selected.
     */
    @Override
    public void lower() {

        super.lower();
        isRandGuess = true;

        if (lowerNumber >= upperNumber) {
            throw new IllegalStateException("Ah, ah, ah! The number can't be lower.");
        }

    }

    /** The higher method overrides the superclass higher method. If random is true,
     * a random higher number will be selected.
     */
    @Override
    public void higher() {

        super.higher();
        isRandGuess = true;

        if (lowerNumber >= upperNumber) {
            throw new IllegalStateException("Ah, ah, ah! The number can't be higher.");
        }

    }

    /** The reset method overrides the superclass reset method. Resets starting midpoint
     * with a random number.
     */
    @Override
    public void reset() {
        super.reset();
        isRandGuess = true;
    }


}
