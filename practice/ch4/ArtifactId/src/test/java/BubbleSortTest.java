import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {


    public void bubbleSort(int[] numbers) {
        boolean numbersSwitched;
        do {
            numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
            }
        } while (numbersSwitched);
    }


    /*
     * Arrays.sort example
     */
    @Test
    public void sortInts() {
        final int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        final int[] expected = {-8, -6, -4, -2, 1, 3, 5, 7, 9};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

}
