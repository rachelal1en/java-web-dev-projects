package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(arr);
        System.out.println(sumEven(arr));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String phraseMod1 = phrase.replace(",", "");
        String phraseMod2 = phraseMod1.replace(".", "");
        ArrayList<String> arrS = new ArrayList<>(Arrays.asList(phraseMod2.split(" ")));

        Scanner input = new Scanner(System.in);
        System.out.println("How many long of a word do you want to search for? (Enter a number of letters):");
        int chosenInt = input.nextInt();

        letterSearch(arrS, chosenInt);


    }
    public static int sumEven(ArrayList < Integer > arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void letterSearch(ArrayList < String > arrS, int chosenInt) {
        for (String i : arrS) {
            if (i.length() == chosenInt){
                System.out.println(i);
            }
        }

    }
}
