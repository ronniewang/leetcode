package array;

/**
 * https://leetcode-cn.com/problems/plus-one/
 *
 * @author ronniewang
 * 2019-12-06 19:50
 */
public class Problem66 {

    public int[] plusOne(int[] digits) {

        if (digits == null || digits.length == 0) {
            throw new IllegalArgumentException("nums is not valid");
        }
        int carry = 0;
        boolean first = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            final int val;
            if (first) {
                val = digits[i] + 1;
                first = false;
            } else {
                val = digits[i] + carry;
            }
            if (val <= 9) {
                digits[i] = val;
                return digits;
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }
        final int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}
