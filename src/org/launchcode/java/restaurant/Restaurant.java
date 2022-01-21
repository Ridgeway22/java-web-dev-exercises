package org.launchcode.java.restaurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {

    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        MenuList item1 = new MenuList("eggs", "fake eggs", "Breakfest",true, 4.25, today
                );
        MenuList item2 = new MenuList("pancakes", "Fluffy pancakes", "Breakfes", true, 5.00, today);
        MenuList item3 = new MenuList("Egg Sandwhich", "Fake eggs on toast", "breakfest", false, 7.43, today);
        MenuList item4 = new MenuList("Fruit", "strawberry", "appertizer", false, 2.56, today);

        ArrayList<MenuList> startingMenu = new ArrayList<>();
        Menu ourBreakfestMenu = new Menu(startingMenu, today);
        ourBreakfestMenu.addItem(item1);
        ourBreakfestMenu.addItem(item1);
        ourBreakfestMenu.addItem(item2);
        ourBreakfestMenu.addItem(item3);
        ourBreakfestMenu.addItem(item4);
        ourBreakfestMenu.printItem(item1);
        ourBreakfestMenu.menuUpdated();
        ourBreakfestMenu.printMenu();
    ourBreakfestMenu.removeItem(item4);
    ourBreakfestMenu.printMenu();


    }
}