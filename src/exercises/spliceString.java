package exercises;

import java.util.Arrays;

public class spliceString {
    public static void main (String[] args){
        String verse = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse. ";
        String[] sp = verse.split("\\s");
        String[] pp = verse.split("\\.");
        System.out.println(Arrays.toString(sp));
        //System.out.println(Arrays.toString(pp));


        for(int i = 0; i < pp.length; i++) {
            System.out.println(pp[i]);
        }
    }
}
