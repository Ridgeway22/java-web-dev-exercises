package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int lengthOfRectangle;
        int widthOfRectangle;
        int areaOfRectangle;
        Scanner input = new Scanner(System.in);
        System.out.println("What are the length of a rectangle?");
         lengthOfRectangle = input.nextInt();
        System.out.println("What are the width of a rectangle?");
        widthOfRectangle = input.nextInt();
        areaOfRectangle = widthOfRectangle * lengthOfRectangle;
        System.out.println("The width "+ widthOfRectangle+ ", the length " + lengthOfRectangle+"and the area is "+ areaOfRectangle);
         input.close();
    }
}
