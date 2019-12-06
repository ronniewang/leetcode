package array;

/**
 * https://leetcode-cn.com/problems/remove-element/
 *
 * @author ronniewang
 * 2019-12-05 15:21
 */
public class Problem27 {

    public int removeElement(int[] nums, int val) {

        if (nums == null) {
            throw new IllegalArgumentException("nums is not valid");
        }
        if (nums.length == 0) {
            return 0;
        }
        int slow = -1;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                ++slow;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}
