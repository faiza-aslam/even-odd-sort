package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortEvenOddV2Test {

    private ISortEvenOdd sortEvenOdd;

    @Before
    public void setUp() {
        sortEvenOdd = new SortEvenOddV2();
    }

    @Test
    public void testSort() {
        // Setup
        final List<Integer> inputList = Arrays.asList(3, 4, 2, 1, 6, 7);
        final List<Integer> expectedList = Arrays.asList(3, 1, 7, 4, 2, 6);

        // Run the test
        final List<Integer> resultList = sortEvenOdd.sort(inputList);

        // Verify the results
        assertEquals("Result List should match", expectedList, resultList);
    }

    @Test
    public void testSort2() {
        // Setup
        final List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6);
        final List<Integer> expectedList = Arrays.asList(1, 3, 5, 2, 4, 6);

        // Run the test
        final List<Integer> resultList = sortEvenOdd.sort(inputList);

        // Verify the results
        assertEquals("Result List should match", expectedList, resultList);
    }

    @Test
    public void testSort3() {
        // Setup
        final List<Integer> inputList = Arrays.asList(1, 3, 5, 7, 9, 11);
        final List<Integer> expectedList = Arrays.asList(1, 3, 5, 7, 9, 11);

        // Run the test
        final List<Integer> resultList = sortEvenOdd.sort(inputList);

        // Verify the results
        assertEquals("Result List should match", expectedList, resultList);
    }

    @Test
    public void testSort4() {
        // Setup
        final List<Integer> inputList = Arrays.asList(0, 2, 4, 6, 8, 10, 12);
        final List<Integer> expectedList = Arrays.asList(0, 2, 4, 6, 8, 10, 12);

        // Run the test
        final List<Integer> resultList = sortEvenOdd.sort(inputList);

        // Verify the results
        assertEquals("Result List should match", expectedList, resultList);
    }

    @Test
    public void testSort5() {
        // Setup
        final List<Integer> inputList = Arrays.asList(111, 20, 11, 55, 81, 13, 11);
        final List<Integer> expectedList = Arrays.asList(111, 11, 55, 81, 13, 11, 20);

        // Run the test
        final List<Integer> resultList = sortEvenOdd.sort(inputList);

        // Verify the results
        assertEquals("Result List should match", expectedList, resultList);
    }
}
