package sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yasin Zhang
 */
public class QuickSortTest {

    @Test
    public void quickSort() {
        Integer[] A = {1, 5, 2, 3, 4, 6, 9, 7, 8, 0};
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        QuickSort q = new QuickSort();
        q.quickSort(A, 0, A.length-1);

        assertArrayEquals(expected, A);
    }

    @Test
    public void randomizedQuickSort() {
        Integer[] A = {1, 5, 2, 3, 4, 6, 9, 7, 8, 0};
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        QuickSort q = new QuickSort();
        q.randomizedQuickSort(A, 0, A.length-1);

        assertArrayEquals(expected, A);
    }
}