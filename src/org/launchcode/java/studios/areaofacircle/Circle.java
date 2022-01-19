package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {
        if (radius.equals(" ")) {
            System.out.println(" Please enter something");
        }
         else if (radius.isNaN()) {
            System.out.println("Please enter a number.");
        }



        return 3.14 * radius * radius;


    }
}
