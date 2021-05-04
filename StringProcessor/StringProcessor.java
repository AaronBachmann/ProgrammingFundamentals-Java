// Aaron Bachmann

public class StringProcessor {

    private String userInput;

    /** Empty Constructor
     */
    public StringProcessor() {
    }

    /** Constructor
     * @param s The user-entered String reference.
     */
    public StringProcessor(String s) {

        this.userInput = s;
    }

    /** setString method
     * @param s The user-entered String reference.
     */
    public void setString(String s) {

        this.userInput = s;
    }

    /** getString method
     * @return The user-entered String.
     */
    public String getString() {

        return this.userInput;
    }

    /** wordCount method removes punctuation and splits the string to count words.
     * @return The word count.
     */
    public int wordCount() {
        // If user enters no input return 0
        if (this.userInput == null || this.userInput.isEmpty()) {
            return 0;
        }

        // Remove punctuation, make lowercase, and split by whitespace, to count individual words
        String[] words = this.userInput.trim().replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+");

        return words.length;
    }

    /** upperCaseCount method counts the number of uppercase characters in string.
     * @return The number of uppercase characters in string.
     */
    public int UpperCaseCount() {
        int count = 0;
        // Check character by character if Uppercase characters are present
        for (int i = 0; i < this.userInput.length(); i++) {
            if (Character.isUpperCase(this.userInput.charAt(i)))
                count += 1;
        }
        return count;
    }

    /** digitCount method counts the number of digit characters in string.
     * @return The number of digit characters in string.
     */
    public int digitCount() {
        int count = 0;
        // Check character by character if digit characters are present
        for (int i = 0; i < this.userInput.length(); i++) {
            if (Character.isDigit(this.userInput.charAt(i)))
                count += 1;
        }
        return count;
    }

    /** digitWordCount method counts the number of written numbers in string 0-9.
     * @return The number of written numbers in string 0-9.
     */
    public int digitWordCount() {
        int count = 0;
        String digWordString = this.userInput.toLowerCase().trim();
        String[] digWordSplit = digWordString.replaceAll("\\p{Punct}", " ").split("\\s+");
        String[] digitWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

        // If split word in array matches one of the numerical words in array, count it
        for (String word : digWordSplit) {
            for (String digitword : digitWords) {
                if (word.equals(digitword))
                    count += 1;
            }

        }
        return count;

    }

    /** getNoSpaceString removes the whitespace in the string.
     * @return The string reference with whitespace removed.
     */
    public String getNoSpaceString() {
        String noSpaceString = this.userInput.trim();

        return noSpaceString.replaceAll("\\s", "");
    }

    /** getNoVowelString replaces vowels with "-".
     * @return The string reference with vowels replaced.
     */
    public String getNoVowelString() {
        String noVowelString = this.userInput.trim();

        return noVowelString.replaceAll("[AEIOUaeiou]", "-");
    }

    /** getNoDigitWordString method replaces written numbers 0-9 with digits 0-9.
     * @return The string reference with replaced digits.
     */
    public String getNoDigitWordString() {
        String[] noDigitWords = this.userInput.trim().split("\\s+\\p{Punct}+");
        StringBuilder builder = new StringBuilder();
        for (String s : noDigitWords) {
            builder.append(s);
        }
        String noDigitWordString = builder.toString();

        // Ignore case but match position with replaceAll() and reg ex
        noDigitWordString = noDigitWordString.replaceAll("(?i) one ", " 1 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)one ", "1 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) one", " 1");
        noDigitWordString = noDigitWordString.replaceAll("(?i) two ", " 2 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)two ", "2 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) two", " 2");
        noDigitWordString = noDigitWordString.replaceAll("(?i) three ", " 3 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)three ", "3 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) three", " 3");
        noDigitWordString = noDigitWordString.replaceAll("(?i) four ", " 4 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)four ", "4 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) four", " 4");
        noDigitWordString = noDigitWordString.replaceAll("(?i) five ", " 5 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)five ", "5 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) five", " 5");
        noDigitWordString = noDigitWordString.replaceAll("(?i) six ", " 6 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)six ", "6 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) six", " 6");
        noDigitWordString = noDigitWordString.replaceAll("(?i) seven ", " 7 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)seven ", "7 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) seven", " 7");
        noDigitWordString = noDigitWordString.replaceAll("(?i) eight ", " 8 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)eight ", "8 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) eight", " 8");
        noDigitWordString = noDigitWordString.replaceAll("(?i) nine ", " 9 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)nine ", "9 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) nine", " 9");
        noDigitWordString = noDigitWordString.replaceAll("(?i) zero ", " 0 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i)zero ", "0 ");
        noDigitWordString = noDigitWordString.replaceAll("(?i) zero", " 0");

        return noDigitWordString;

    }

}




