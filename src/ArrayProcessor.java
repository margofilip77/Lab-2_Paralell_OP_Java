import java.util.Arrays;
public class ArrayProcessor {
    private static int randomIndex = -1;
    public static int[] generateArray(int length){
        int[] array = new int[length];
        Arrays.fill(array, Integer.MAX_VALUE);

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        randomIndex = (int) (Math.random() * length);
        array[randomIndex] = -10;

        return array;
    }
}
