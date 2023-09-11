import java.util.Random;

public class FunWithStrings {
    public static void main(String[] args) {
        System.out.println("This program demonstrates a few things about strings.");
        String phrase = "It is a very gloomy Monday, and the Bears suck.";
        int charCount = phrase.length();
        String chars3To8 = phrase.substring(16,30);
        System.out.printf("There are %d characters in the string, and the substring is %s.\n", charCount, chars3To8);
        String upper = phrase.toUpperCase();
        String lower = phrase.toLowerCase();
        System.out.println("The uppercase of this is " + upper + ".");
        Random randy = new Random();  
        int startPos = randy.nextInt(charCount);
        char randomChar = phrase.charAt(startPos);
        System.out.println("The randomly chosen character is at position " + startPos + " and is a " + randomChar + ".");
    }
}

