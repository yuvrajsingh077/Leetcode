class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int m = nums[0];
        int sum = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                m += nums[i];
            } else {
                m = nums[i];
            }
            sum = Math.max(sum, m);
        }
        
        return sum;
    }
}
