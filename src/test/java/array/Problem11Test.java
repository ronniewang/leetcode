package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem11Test {

    @Test(expected = IllegalArgumentException.class)
    public void maxArea_whenIllegalArg_thenThrowException() {

        final int[] ints = {1};
        new Problem11().maxArea(ints);
    }

    @Test
    public void maxArea_when11_thenReturn1() {

        final int[] ints = {1, 1};
        final int maxArea = new Problem11().maxArea(ints);
        assertEquals(maxArea, 1);
    }

    @Test
    public void maxArea_when1145_thenReturn1() {

        final int[] ints = {1, 1, 4, 5, 1, 1};
        final int maxArea = new Problem11().maxArea(ints);
        assertEquals(maxArea, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void maxArea1_whenIllegalArg_thenThrowException() {

        final int[] ints = {1};
        new Problem11().maxArea1(ints);
    }

    @Test
    public void maxArea1_when11_thenReturn1() {

        final int[] ints = {1, 1};
        final int maxArea = new Problem11().maxArea1(ints);
        assertEquals(maxArea, 1);
    }

    @Test
    public void maxArea1_when1145_thenReturn1() {

        final int[] ints = {1, 1, 4, 5, 1, 1};
        final int maxArea = new Problem11().maxArea1(ints);
        assertEquals(maxArea, 5);
    }
}