package array;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * <p>
 * 给数组原地去重，并返回元素个数
 *
 * @author ronniewang
 * 2019-12-05 15:21
 */
public class Problem26 {

    public int removeDuplicates(int[] nums) {

        if (nums == null) {
            throw new IllegalArgumentException("nums is not valid");
        }
        if (nums.length == 0) {
            return 0;
        }
        int notDupIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[notDupIndex] != nums[i]) {
                ++notDupIndex;
                nums[notDupIndex] = nums[i];
            }
        }
        return notDupIndex + 1;
    }
}
