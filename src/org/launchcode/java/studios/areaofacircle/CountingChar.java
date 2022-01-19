package org.launchcode.java.studios.areaofacircle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase");
        String paragraph = input.nextLine();
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charactersInString = paragraph.toCharArray();

        for(Character character : charactersInString){
            if( charCount.containsKey(character) ){

               charCount.put(character, charCount.get(character)+1);
            } else {
                charCount.put(character, 1);
            }

        }

        for (Map.Entry<Character, Integer> initial : charCount.entrySet()) {
            System.out.println(initial.getKey() + ":" + initial.getValue());
//                if(initial.getKey().equals(initial.getKey())){
//                    initial.setValue();
//                }
////
        }



            }




    }

