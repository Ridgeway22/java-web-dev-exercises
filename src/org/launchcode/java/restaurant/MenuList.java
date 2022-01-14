package org.launchcode.java.restaurant;

public class MenuList {

    private String name;
    private String description;
    private Boolean newOrNot;
    private Double price;


    public MenuList( Boolean newOrNot, Double price,  String name, String description) {
        this.newOrNot = newOrNot;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Boolean getNewOrNot() {
        return newOrNot;
    }

    public void setNewOrNot(Boolean newOrNot) {
        this.newOrNot = newOrNot;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}