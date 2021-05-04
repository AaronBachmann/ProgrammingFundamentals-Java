// Aaron Bachmann

public class NumberGuesser {
    // Declare instance variables
    protected int lowerNumber;
    protected int upperNumber;
    private int currentMidPoint;
    private int originalLower;
    private int originalUpper;


    /** Constructor
     @param lowerBound The lowest number of the range.
     @param upperBound The highest number of the range.
     */
    public NumberGuesser(int lowerBound, int upperBound) {
        originalLower = lowerNumber = lowerBound;
        originalUpper = upperNumber = upperBound;
    }

    public int getLowerNumber() {
        return lowerNumber;
    }

    public void setLowerNumber(int lowerNumber) {
        this.lowerNumber = lowerNumber;
    }

    public int getUpperNumber() {
        return upperNumber;
    }

    public void setUpperNumber(int upperNumber) {
        this.upperNumber = upperNumber;
    }

    /** The higher method changes the lower number to the current midpoint.
     */

    public void higher() {

        lowerNumber = getCurrentGuess() + 1;

        if (upperNumber < lowerNumber || upperNumber > originalUpper)  {
            throw new IllegalStateException("That's cheating! The number can't be higher.");
        }

    }

    /** The lower method changes the higher number to the current midpoint.
     */
    public void lower() {

        upperNumber = getCurrentGuess() - 1;

        if (lowerNumber > upperNumber || lowerNumber < originalLower) {
            throw new IllegalStateException("That's cheating! The number can't be lower.");
        }


    }

    /** The getCurrentGuess method calculates the midpoint of lowerNumber and upperNUmber
     */
    public int getCurrentGuess() {

        currentMidPoint = (lowerNumber + upperNumber) / 2;

        return currentMidPoint;

    }

    /** The reset method resets the lowerNumber and higherNumber to original settings.
     */
    public void reset() {
        lowerNumber = originalLower;
        upperNumber = originalUpper;


    }

}
