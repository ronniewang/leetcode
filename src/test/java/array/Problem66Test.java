package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem66Test {

    @Test
    public void plusOne_when0_then1() {

        final int[] ints = new Problem66().plusOne(new int[]{0});
        assertEquals(ints.length, 1);
        assertEquals(1, ints[0]);
    }

    @Test
    public void plusOne_when999_thenCarry() {

        final int[] ints = new Problem66().plusOne(new int[]{9, 9, 9});
        assertEquals(ints.length, 4);
        assertTrue(ints[0] == 1
                && ints[1] == 0
                && ints[2] == 0
                && ints[3] == 0);
    }

    @Test
    public void plusOne_when998_then999() {

        final int[] ints = new Problem66().plusOne(new int[]{9, 9, 8});
        assertEquals(ints.length, 3);
        assertTrue(ints[0] == 9
                && ints[1] == 9
                && ints[2] == 9);
    }
}