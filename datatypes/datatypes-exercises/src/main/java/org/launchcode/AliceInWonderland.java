package org.launchcode;

import java.util.Locale;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("What word do you want to search for?: ");
        String searchTerm = input.nextLine().toUpperCase();

        if (aliceSentence.toUpperCase().contains(searchTerm)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(searchTerm);
        Integer index = aliceSentence.toUpperCase().indexOf(searchTerm);
        Integer length = searchTerm.length();

        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        Integer endIndex = index + length;

        String modifiedString = aliceSentence.substring(0, index) + aliceSentence.substring(endIndex, aliceSentence.length());
        System.out.println(modifiedString);


    }
}
