package example;

public class DigitsToWords {
    public static String  digitsToWords(int number){
        final String[] WORDS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(number ==0) return "";
        String result = digitsToWords(number / 10);

        result += WORDS[number % 10] + " ";
        return result;
    }
}
