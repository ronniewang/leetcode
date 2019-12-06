package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem27Test {

    @Test
    public void removeElement() {

        final int[] ints = {1, 1, 2, 2, 3, 4, 5, 5};
        final int num = new Problem27().removeElement(ints, 1);
        assertEquals(num, 6);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}