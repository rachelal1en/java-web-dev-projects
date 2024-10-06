package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("burger", 8.99, "freshly made burger", "main");
        MenuItem item2 = new MenuItem("sundae", 5.99, "with brownie", "dessert");
        MenuItem item3 = new MenuItem("misc. appetizer", 6.99, "for sharing", "appetizer");

        Date dateUpdated = new Date();
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        public ArrayList<MenuItem> getMenuItems () {
            return MenuItem;
        }
    }



}
