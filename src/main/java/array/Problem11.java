package array;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * <p>
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * <p>
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。
 * 在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 * @author ronniewang
 * 2019-12-05 15:21
 */
public class Problem11 {

    /**
     * 暴力法，是自己想出来的，时间复杂度高
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        if (height == null || height.length < 2) {
            throw new IllegalArgumentException("height is not valid");
        }
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                final int minHeight = Math.min(height[i], height[j]);
                final int area = minHeight * (j - i);
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    /**
     * 双指针法，看解法知道的思路，自己写的代码
     *
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {

        if (height == null || height.length < 2) {
            throw new IllegalArgumentException("height is not valid");
        }
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            if (height[i] <= height[j]) {
                max = Math.max(max, height[i] * (j - i));
                i++;
            } else {
                max = Math.max(max, height[j] * (j - i));
                j--;
            }
        }
        return max;
    }
}
