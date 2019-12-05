package array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和
 * 为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author ronniewang
 * 2019-12-05 15:21
 */
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("nums is not valid");
        }
        Map<Integer/*number*/, Integer/*index*/> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            final Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                if (i > index) {
                    return new int[]{index, i};
                } else {
                    return new int[]{i, index};
                }
            }
        }
        return null;
    }
}
