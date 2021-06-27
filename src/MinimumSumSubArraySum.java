public class MinimumSumSubArraySum {

    // https://leetcode.com/problems/minimum-size-subarray-sum/
    // 209. Minimum Size Subarray Sum
    // Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
    // of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int from = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - from + 1);
                sum -= nums[from++];
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

}
