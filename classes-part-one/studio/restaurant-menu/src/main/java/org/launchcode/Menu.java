package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

        private ArrayList<MenuItem> menuItems = new ArrayList<>();
        private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
        @Override
        public String toString() {
            StringBuilder appetizers = new StringBuilder();
            for (MenuItem item: menuItems) {
                if (item.getCategory().equals("appetizer")) {
                    appetizers.append("\n" + item.toString() + "\n");
                }
            }
            StringBuilder mainCourses = new StringBuilder();
            for (MenuItem item: menuItems) {
                if (item.getCategory().equals("main course")) {
                    mainCourses.append("\n" + item.toString() + "\n");
                }
            }
            StringBuilder desserts = new StringBuilder();
            for (MenuItem item: menuItems) {
                if (item.getCategory().equals("dessert")) {
                    desserts.append("\n" + item.toString() + "\n");
                }
            }
            return "\nTONY'S PIZZA MENU\n\n" +
                    "APPETIZERS" + appetizers.toString() +
                    "\nMAIN COURSES" + mainCourses.toString() + "\n" +
                    "DESSERTS" + desserts.toString() + "\n";
        }
        //add item and update last updated
        void addItem(MenuItem newItem) {
            //bonus bit to prevent duplicates
            String errorMessage = "That item has already been added to the menu.";
            if (menuItems.contains(newItem)){
                System.out.println(errorMessage);
                return;
            }
            for (MenuItem item : menuItems){
                if (item.equals(newItem)){
                    System.out.println(errorMessage);
                    return;
                }
            }
            //end of bonus bit
            menuItems.add(newItem);
            lastUpdated = LocalDate.now();
        }
        //remove item and update last updated
        void removeItem(MenuItem item) {
            menuItems.remove(item);
            lastUpdated = LocalDate.now();
        }

}
