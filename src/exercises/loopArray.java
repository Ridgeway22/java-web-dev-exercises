package exercises;
import java.util.ArrayList;
public class loopArray {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 11; i++ ) {
            nums.add(i);
            System.out.print(i + " ");
        }
        System.out.println("");
        ArrayList<Integer> num = new ArrayList<>();
        for (int j = 10; j > 0; j-- ) {
            num.add(j);
            System.out.print(j + " ");
        }
    }
}
