import java.util.Arrays;
import java.util.NoSuchElementException;

public class Function {

    public static int calculatingSumOfTwoMinNumbers(int[] array) {
        if (array.length < 2) {
            throw new NoSuchElementException("В массиве меньше двух чисел");
        }

        Arrays.sort(array);
        int firstMin = array[0];
        int secondMin = array[1];

        return firstMin + secondMin;
    }

}
