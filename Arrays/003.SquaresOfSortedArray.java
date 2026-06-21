//link: https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0, j = n - 1;
        int k = n - 1; // fill result from the end

        while (i <= j) {
            int leftSq = nums[i] * nums[i];
            int rightSq = nums[j] * nums[j];

            if (leftSq > rightSq) {
                result[k] = leftSq;
                i++;
            } else {
                result[k] = rightSq;
                j--;
            }
            k--;
        }

        return result;
    }
}
