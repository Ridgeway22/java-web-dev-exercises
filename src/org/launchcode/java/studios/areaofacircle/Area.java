package org.launchcode.java.studios.areaofacircle;
import org.launchcode.java.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = input.nextDouble();

        double area1 = Circle.getArea(radius);

        System.out.println("The area of a circle of radius "+ radius + " is: " + area1);
        input.close();
    }
}
