package sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yasin Zhang
 */
public class HeapSortTest {

    @Test
    public void heapSort() {
        Integer[] A = {1, 5, 2, 3, 4, 6, 9, 7, 8, 0};
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        HeapSort h = new HeapSort();
        h.heapSort(A);

        assertArrayEquals(expected, A);
    }
}
