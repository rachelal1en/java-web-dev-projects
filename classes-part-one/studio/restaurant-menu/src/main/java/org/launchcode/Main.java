package org.launchcode;

public class Main {

    public static void main(String[] args) {
        //created menu items
        MenuItem item1 = new MenuItem("Cheese Pizza", 10.99, "Classic cheese pizza", "main course");
        MenuItem item2 = new MenuItem("Turkey Burger", 8.00, "With montreal steak seasoning", "main course");
        MenuItem item3 = new MenuItem("Cranberry Salad", 6.00, "Spinach, cranberries, goat Cheese", "appetizer");
        MenuItem item4 = new MenuItem("Brownie Earthquake", 6.00, "Vanilla icecream, brownie, hot fudge, oreos", "dessert");
        MenuItem item5 = new MenuItem("Toll House Chocolate Chip Cookies", 4.00, "The best chocolate chip cookies", "dessert");

        //created menu
        Menu menu = new Menu();

        //added items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        //printed menu
        System.out.println(menu);

        //printed one item
        System.out.println(item1);

        //removed an item and reprinted menu
        menu.removeItem(item4);
        System.out.println(menu);

        //tested custom equals method
        System.out.println(item1.equals(item2));

        //try to add a duplicate
        MenuItem item6 = new MenuItem("Toll House Chocolate Chip Cookies", 4.00, "The best chocolate chip cookies", "dessert");
        System.out.println(item5.equals(item6));
        menu.addItem(item6);
        System.out.println(menu);

        menu.addItem(item1);
        System.out.println(menu);

        MenuItem item7 = new MenuItem("Taylor's Chai Cookies", 4.00, "From TSwift herself", "dessert");
        menu.addItem(item7);
        System.out.println(menu);
    }
}
