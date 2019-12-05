package array;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class Problem1Test {

    @Test
    public void twoSum_whenHasResult_thenGetResult() {

        final int[] ints = {1, 2, 3};
        final int[] twoSum = new Problem1().twoSum(ints, 3);
        assertTrue(twoSum[0] == 0 && twoSum[1] == 1);
    }

    @Test
    public void twoSum_whenNoResult_thenGetNull() {

        final int[] ints = {1, 2, 3};
        final int[] twoSum = new Problem1().twoSum(ints, 6);
        assertNull(twoSum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_whenIllegalArg_thenThrowException() {

        final int[] ints = {1};
        final int[] twoSum = new Problem1().twoSum(ints, 6);
        assertNull(twoSum);
    }
}