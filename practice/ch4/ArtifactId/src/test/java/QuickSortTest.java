
import org.junit.Test;
import sun.awt.image.IntegerComponentRaster;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {


    public static List<Integer> quicksort(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        // use first number as pivot
        final Integer pivot = numbers.get(0);
        final List<Integer> lower = new ArrayList<Integer>();
        final List<Integer> higher = new ArrayList<Integer>();

        // iterate and add numbers to lower and upper array list
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));
            }
        }

        // sort lower and upper lists and combine them
        final List<Integer> sorted = quicksort(lower);

        sorted.add(pivot);
        sorted.addAll(quicksort(higher));

        return sorted;
    }



    @Test
    public void sortInts() {
        final int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        final int[] expected = {-8, -6, -4, -2, 1, 3, 5, 7, 9};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }



}
