package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {9, 9, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 9, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 9, 10, 0, 22};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 7, 9, 10, 22};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {9, 5, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}