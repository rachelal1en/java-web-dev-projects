package org.launchcode;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItems (String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    private String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private Double getPrice() {
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    private String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    private String getCategory() {
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    private Boolean getIsNew() {
        return isNew;
    }
    public void setIsNew(Boolean isNew){
        this.isNew = isNew;
    }



}
