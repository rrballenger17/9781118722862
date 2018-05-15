
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;


import java.util.*;

public class MapTest {

    @Test
    public void overwriteKey() {
        final Map<String, String> preferences = new HashMap<String, String>();
        preferences.put("like", "jacuzzi");
        preferences.put("dislike", "steam room");

        assertEquals("jacuzzi", preferences.get("like"));

        preferences.put("like", "sauna");

        assertEquals("sauna", preferences.get("like"));
    }

    @Test
    public void treeMapTraversal() {
        final Map<Integer, String> counts = new TreeMap<Integer, String>();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");

        final Iterator<Integer> keys = counts.keySet().iterator();
        assertEquals(Integer.valueOf(1), keys.next());
        assertEquals(Integer.valueOf(2), keys.next());
        assertEquals(Integer.valueOf(3), keys.next());
        assertEquals(Integer.valueOf(4), keys.next());
        assertFalse(keys.hasNext());
    }


    @Test
    public void linkedHashMapTraversal() {
        final Map<Integer, String> counts = new LinkedHashMap<Integer, String>();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");

        final Iterator<Integer> keys = counts.keySet().iterator();
        assertEquals(Integer.valueOf(4), keys.next());
        assertEquals(Integer.valueOf(1), keys.next());
        assertEquals(Integer.valueOf(3), keys.next());
        assertEquals(Integer.valueOf(2), keys.next());
        assertFalse(keys.hasNext());
    }


}
