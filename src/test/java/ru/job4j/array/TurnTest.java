package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {5, 6, 9, 0, 0, 1, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[] {7, 1, 0, 0, 9, 6, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithEven2AmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 3, 4, 6};
        int[] result = Turn.back(input);
        int[] expected = new int[] {6, 4, 3, 2};
        Assert.assertArrayEquals(expected, result);
    }
}