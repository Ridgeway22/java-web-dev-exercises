package org.launchcode.java.restaurant;

import java.util.Date;

public class MenuList {

    private String name;
    private String description;
    private String catagory;
    private Boolean newOrNot;
    private Double price;
    private Date dateAdded;

    public MenuList(String name, String description, String catagory, Boolean newOrNot, Double price, Date dateAdded) {
        this.name = name;
        this.description = description;
        this.catagory = catagory;
        this.newOrNot = newOrNot;
        this.price = price;
        this.dateAdded = dateAdded;
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

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
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

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}