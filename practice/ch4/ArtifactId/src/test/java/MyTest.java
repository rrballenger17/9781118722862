
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class MyTest {

    /*
     * Arrays.sort example
     */
    @Test
    public void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void sortObjects() {
        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }

    private static class NotComparable {
        private int i;
        private NotComparable(final int i) {
            this.i = i;
        }
    }

    public class NotComparableComparator implements Comparator<NotComparable> {

        public int compare(NotComparable o1, NotComparable o2) {
            return o1.i - o2.i;
        }
    }

    @Test
    public void sortNotComparable() {
        final List<NotComparable> objects = new ArrayList<NotComparable>();
        for (int i = 0; i < 5; i++) {

            int objValue = i * -1;

            if(i % 2 == 0){
                objValue *= -1;
            }

            objects.add(new NotComparable(objValue));
        }

        try {
            Collections.sort(objects, new NotComparableComparator());
        } catch (Exception e) {
            // correct behavior – cannot sort
           fail();
        }

        List<Integer> results = new ArrayList<Integer>();
        for(NotComparable obj: objects){
            //System.out.println(obj.i);
            results.add(obj.i);
        }

        Integer[] arr = {-3, -1, 0, 2, 4};

        assertArrayEquals(results.toArray(), arr);

    }

}
