import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        long goodPairs = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            int key = nums[j] - j;
            goodPairs += countMap.getOrDefault(key, 0);
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        long totalPairs = (long) n * (n - 1) / 2;
        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4, 1, 3, 3};
        System.out.println(solution.countBadPairs(nums1));  // Output: 5

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(solution.countBadPairs(nums2));  // Output: 0
    }
}
