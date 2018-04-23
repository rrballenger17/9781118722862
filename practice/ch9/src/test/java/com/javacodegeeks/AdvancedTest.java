package com.javacodegeeks;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class AdvancedTest {

    private static int counter = 0;

    @BeforeClass
    public static void suiteSetup() {
        assertEquals(0, counter);
        counter++;
    }

    public AdvancedTest() {
        assertTrue(Arrays.asList(1, 5).contains(counter));
        counter++;
    }

    @Before
    public void prepareTest() {
        assertTrue(Arrays.asList(2, 6).contains(counter));
        counter++;
    }

    @Test
    public void peformFirstTest() {
        assertTrue(Arrays.asList(3, 7).contains(counter));
        counter++;
    }

    @Test
    public void performSecondTest() {
        assertTrue(Arrays.asList(3, 7).contains(counter));
        counter++;
    }

    @After
    public void cleanupTest() {
        assertTrue(Arrays.asList(4, 8).contains(counter));
        counter++;
    }

    @AfterClass
    public static void suiteFinished() {
        assertEquals(9, counter);
    }
}







