package exercises;

public class sumFunc {
    public static int sums (int[] sumss) {
        int addInts = 0;

        for (int i = 0; i < sumss.length; i++) {

            if (sumss[i] % 2 == 0) {
                addInts = addInts + sumss[i];

                //System.out.format("Addition of %d to Sum = %d \n", someOtherInts[i], addInts);
            }
        }
        return addInts;
    }
}
