package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                roster.put(newID, newStudent);

                input.nextLine();
            }
            } while(!newStudent.equals(""));

            input.close();

            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> student : roster.entrySet()) {
                System.out.println(student.getValue() + "'s ID: " + student.getKey());
            }

            System.out.println("Number of students in roster: " + roster.size());



    }
}
