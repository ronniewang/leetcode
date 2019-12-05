package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem26Test {

    @Test
    public void removeDuplicates() {

        final int[] ints = {1, 1, 2, 2, 3, 4, 5, 5};
        final int num = new Problem26().removeDuplicates(ints);
        assertEquals(num, 5);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}