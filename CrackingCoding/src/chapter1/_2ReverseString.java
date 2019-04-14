package chapter1;

/**
 * Reverse a String
 */
public class ReverseString {

    public static void main(String[] args){
        System.out.println(ReverseString.reverseString("HelloWorld"));

    }


    public static String reverseString(String input) {

        char[] charArray = new char[input.length()];
        for(int i=0; i< input.length(); i++) {
            charArray[i] = input.charAt(input.length()-i-1);

        }

        return new String(charArray);

    }
}
