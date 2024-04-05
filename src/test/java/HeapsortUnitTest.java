import org.example.Heapsort;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapsortUnitTest {
    @Test
    public void simpleTest() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};

        int[] result = Heapsort.heapSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

        int[] expected = new int[10000];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = i + 1;
        }

        int[] result = Heapsort.heapSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {12, 11, 13, 5, 6, 7, 11};
        int[] expected = {5, 6, 7, 11, 11, 12, 13};

        int[] result = Heapsort.heapSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithNegatives() {
        int[] arr = {12, -11, 13, -5, 6, -7};
        int[] expected = {-11, -7, -5, 6, 12, 13};

        int[] result = Heapsort.heapSort(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {5};
        int[] expected = {5};

        int[] result = Heapsort.heapSort(arr);

        assertArrayEquals(expected, result);
    }
}
