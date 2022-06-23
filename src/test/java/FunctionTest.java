import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class FunctionTest {

    @Test
    public void functionShouldWork1() {
        int[] someArray = {4, 0, 3, 19, 492, -10, 1};

        int result = Function.calculatingSumOfTwoMinNumbers(someArray); //сумма наименьших элементов -10 + 0

        Assertions.assertEquals(-10, result);
    }

    @Test
    public void functionShouldWork2() {
        int[] someArray = {-150, -30, -15, -40, -50, 0, 124, 350};

        int result = Function.calculatingSumOfTwoMinNumbers(someArray); //сумма наименьших элементов -150 + (-50)

        Assertions.assertEquals(-200, result);
    }

    @Test
    public void functionShouldWork3() {
        int[] someArray = {2, 74, 10, 33, 324324, 2, 489, 777};

        int result = Function.calculatingSumOfTwoMinNumbers(someArray); //сумма наименьших элементов 2 + 2

        Assertions.assertEquals(4, result);
    }

    @Test
    public void functionShouldWorkWithOneHundredMillionElements() {
        int[] someArray = new int[100000000];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = someArray.length - i;
        }

        int result = Function.calculatingSumOfTwoMinNumbers(someArray); //сумма наименьших элементов 1 + 2

        Assertions.assertEquals(3, result);
    }

    @Test
    public void functionShouldThrowNoSuchElementExceptionWithEmptyArray() {
        int[] someArray = {};

        Assertions.assertThrows(NoSuchElementException.class, () -> {
            Function.calculatingSumOfTwoMinNumbers(someArray);
        }, "В массиве меньше двух чисел");
    }

    @Test
    public void functionWithoutNumbersShouldCalculateZero() {
        int[] someArray = new int[100];

        int result = Function.calculatingSumOfTwoMinNumbers(someArray); //все элементы равны 0, сумма наименьших равна 0

        Assertions.assertEquals(0, result);
    }
}
