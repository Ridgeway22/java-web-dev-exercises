package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuList> items;
    public Date latestDate;

    public Menu(ArrayList<MenuList> items, Date latestDate) {
        this.items = items;
        this.latestDate = latestDate;
    }

    public ArrayList<MenuList> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuList> items) {
        this.items = items;
    }

    public Date getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(Date latestDate) {
        this.latestDate = latestDate;
    }

    public ArrayList<MenuList> addItem(MenuList item){// add items to the list
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuList> removeItem(MenuList item){// remove an item
        int toBeRemoved = -1;
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(item)){
                toBeRemoved = 1;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return ("The menu was last update on " + this.latestDate);
    }

    public void printItem(MenuList item){
            System.out.println(item.getDescription());
    }

    public void printMenu(){
        for(int i = 0; i < items.size(); i++) {
            System.out.println("Name: "+items.get(i).getName()+",   Descripton: "+items.get(i).getDescription()+",    Catatgory: "+ items.get(i).getCatagory()+"    New or Not: "+ items.get(i).getNewOrNot()+"     Price: "+ items.get(i).getPrice());
        }
    }
}
