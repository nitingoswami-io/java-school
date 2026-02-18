package com.backto.school.algo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class QuickSortAlgoTest {

    @Test
    void shouldSortUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void shouldHandleAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void shouldHandleReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void shouldHandleArrayWithDuplicates() {
        int[] arr = {5, 2, 8, 2, 9, 1, 5, 5};
        int[] expected = {1, 2, 2, 5, 5, 5, 8, 9};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void shouldHandleSingleElementArray() {
        int[] arr = {42};
        int[] expected = {42};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void shouldHandleTwoElementArray() {
        int[] arr = {2, 1};
        int[] expected = {1, 2};

        QuickSortAlgo.quickSort(arr);

        assertArrayEquals(expected, arr);
    }
}
