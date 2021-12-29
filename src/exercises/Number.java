package exercises;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        double numberOfMilesdriven;
        double amountOfGasUsed;
        double milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("How may miles have you driven?");
        numberOfMilesdriven = input.nextDouble();
        System.out.println("How many gallons did you use?");
        amountOfGasUsed = input.nextInt();
        milesPerGallon = numberOfMilesdriven / amountOfGasUsed;
        System.out.println("The miles per gallon " + milesPerGallon);
        input.close();
    }
}
