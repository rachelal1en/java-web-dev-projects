package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
    //custom toString
    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + " | $" + price;
    }
    //custom equals
    @Override
    public boolean equals(Object toBeCompared) {
        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }
    //was added in last 90 days?
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return  daysBetween < 90;
    }
}
