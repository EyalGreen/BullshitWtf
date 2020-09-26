package com.eyal.bullshitwtf;
import java.util.Arrays;
import java.util.Random;


public class Utils {
    public static <T>  T[] shuffleArray(final T[] inputArray) {
        T[] result = Arrays.copyOf(inputArray, inputArray.length);
        int index;
        Random random = new Random();
        for (int i = result.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                swap(result, i, index);
            }
        }
        return result;
    }
    private static <T> void swap(final T[] input, int srcPos, int dstPos) {
        if (dstPos != srcPos) {
            T tmp = input[dstPos];
            input[dstPos] = input[srcPos];
            input[srcPos] = tmp;
        }
    }
}
