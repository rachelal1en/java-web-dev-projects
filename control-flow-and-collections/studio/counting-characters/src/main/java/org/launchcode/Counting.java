package org.launchcode;

import java.util.*;

public class Counting {
    public static void main(String[] args) {
        String bees = "NARRATOR: (Black screen with text; The sound of buzzing bees can be heard) According to all known laws of aviation, there is no way a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyway because bees don't care what humans think is impossible.";
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence(s):");
        String userInput = input.nextLine();


        char[] charInString = /*bees*/userInput.toLowerCase().toCharArray();

        characterSearch(charInString);

    }

    public static void characterSearch (char[] arr) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char i : arr){
            if (!charCount.containsKey(i)){
                if (Character.isLetter(i)) {
                    charCount.put(i, 0);
                }
            }
            if (charCount.containsKey(i)){
                charCount.put(i, charCount.get(i) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry);
        }
    }

}
