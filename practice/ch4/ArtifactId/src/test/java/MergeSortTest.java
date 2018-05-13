
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    public static List<Integer> mergesort(final List<Integer> values) {
        if (values.size() < 2) {
            return values;
        }

        final List<Integer> leftHalf =
                values.subList(0, values.size() / 2);
        final List<Integer> rightHalf =
                values.subList(values.size() / 2, values.size());

        return merge(mergesort(leftHalf), mergesort(rightHalf));
    }

    private static List<Integer> merge(final List<Integer> left,
                                       final List<Integer> right) {
        int leftPtr = 0;
        int rightPtr = 0;

        final List<Integer> merged =
                new ArrayList<Integer>(left.size() + right.size());

        while (leftPtr < left.size() && rightPtr < right.size()) {
            if (left.get(leftPtr) < right.get(rightPtr)) {
                merged.add(left.get(leftPtr));
                leftPtr++;
            } else {
                merged.add(right.get(rightPtr));
                rightPtr++;
            }
        }

        while (leftPtr < left.size()) {
            merged.add(left.get(leftPtr));
            leftPtr++;
        }

        while (rightPtr < right.size()) {
            merged.add(right.get(rightPtr));
            rightPtr++;
        }

        return merged;
    }

    @Test
    public void sortInts() {
        final int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        final int[] expected = {-8, -6, -4, -2, 1, 3, 5, 7, 9};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

}
