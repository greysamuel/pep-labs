
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        int[] occurrences = new int[255];
    for (int i = 0; i < str.length(); i++) {
        occurrences[str.charAt(i)]++;
    }
    int max = 0;
    char symbol = 0;
    for (int i = 0; i < occurrences.length; i++) {
        if (occurrences[i] > max) {
            max = occurrences[i];
            symbol = (char) i;
        }
    }
        return symbol;
    }
}
