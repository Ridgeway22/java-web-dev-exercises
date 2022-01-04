package exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.String;
import java.util.ListIterator;

public class NumberWord {

        public static ArrayList<String> word (int num1) {
            String num = "The word should be five letters like house tower batman yellow blue green. ";

            String[] str = num.split("\\s+");
            ArrayList<String> apple = new ArrayList<>();
            //String al = Arrays.toString(str);
            //String[] al = Arrays.asList(str);

            for (int i = 0; i < str.length; i++){
                if(num1 == str[i].length()){
                  apple.add(str[i]);
                }


            }
            return apple;
        }
    }

