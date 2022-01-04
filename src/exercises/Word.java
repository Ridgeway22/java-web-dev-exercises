package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Word {
    public static void main (String[] args){
        int nums;
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter a number of letter words you would like");
     nums = input.nextInt();
     ArrayList words = NumberWord.word(nums);
    System.out.println(words);
     input.close();
    }
}
