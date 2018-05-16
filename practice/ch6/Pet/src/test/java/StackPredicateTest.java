
import org.junit.Test;
import java.io.*;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

// Template pattern
// The Template Pattern is used to defer or delegate some or all steps of an algorithm to a subclass.

public class StackPredicateTest {

    private Stack stack;

    @Before
    public void createStack() {
        stack = new Stack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
    }

    @Test
    public void evenPredicate() {
        final Stack filtered = stack.filter(
            new StackPredicate() {
                @Override
                public boolean isValid(int i) {
                    return (i % 2 == 0);
                }
            }
        );

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
        assertEquals(Integer.valueOf(6), filtered.pop());
    }

    @Test
    public void allPredicate() {
        final Stack filtered = stack.filter(new StackPredicate() {
            @Override
            public boolean isValid(int i) {
                return true;
            }
        });

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(9), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
    }
}