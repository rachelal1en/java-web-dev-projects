package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of a rectangle: ");
        double length = input.nextDouble();

        System.out.println("Input the width of a rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("Your rectangle of length " + length + " and width " + width + " has an area of: " + area);
    }
}
