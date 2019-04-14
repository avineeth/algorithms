package chapter1;

/**
 * Problem - Determine if a string has all unique characters
 * Assumption - String is ASCII - 128 possible characters
 * Time Complexity O(n) - length of the string
 * Space Complexity O(1)
 */
public class UniqueCharacters {

    public static void main(String[] args) {

        String input = "ABCDEFGHIJK";
        UniqueCharacters uc = new UniqueCharacters();
        System.out.println(uc.checkUniqueCharacters(input));

    }

    public boolean checkUniqueCharacters(String input) {

        boolean[] uniqueArray = new boolean[128];

        for(int i=0; i< input.length(); i++) {
            int charAsciiVal = input.charAt(i);
            if( uniqueArray[charAsciiVal]) {
                //character has occured before
                return false;
            }
            uniqueArray[charAsciiVal] = true;
        }

        return true;
    }
}
