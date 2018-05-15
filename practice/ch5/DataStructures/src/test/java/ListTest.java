

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;


import java.util.*;

public class ListTest {

    // System.arraycopy
    @Test
    public void arrayCopy() {
        int[] integers = {0, 1, 2, 3, 4};

        int[] newIntegersArray = new int[integers.length + 1];
        System.arraycopy(integers, 0, newIntegersArray, 0, integers.length);
        integers = newIntegersArray;
        integers[5] = 5;

        assertEquals(5, integers[5]);
    }

    @Test
    public void linkedListStrength() {

        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        // insert in middle
        list.add(3, 4);

        assertEquals(list.get(4), Integer.valueOf(5));
    }


    @Test
    public void arrayListStrength() {

        List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // get the 4th element
        assertEquals(list.get(3), Integer.valueOf(4));
    }


    @Test
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<String>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertEquals("third", queue.peek());
        assertEquals("third", queue.remove());
    }


}
