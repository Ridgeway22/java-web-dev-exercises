package org.launchcode.java.restaurant;

import java.util.Date;

public class Menu {
    private String breakfast;
    private String lunch;
    private String dessert;
    private Integer Date;
    private String appetizer;
    private String dinner;

    public Menu( String lunch, String dessert, Integer date) {
        this.lunch = lunch;
        this.dessert = dessert;
        Date = date;
    }

    public Menu(String dessert, Integer date, String appetizer, String dinner) {
        this.dessert = dessert;
        Date = date;
        this.appetizer = appetizer;
        this.dinner = dinner;
    }

    public Menu(Integer date, String dinner) {
        Date = date;
        this.dinner = dinner;
    }

    public Menu(String breakfast, Integer date) {
        this.breakfast = breakfast;
        Date = date;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }
    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        lunch = lunch;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public Integer getDate() {
        return Date;
    }

    public void setDate(Integer date) {
        Date = date;
    }


}
