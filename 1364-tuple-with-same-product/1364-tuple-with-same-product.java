import java.util.*;

public class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        
        // Generate all possible (a, b) pairs and count product frequencies
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        
        // Count valid tuples based on product frequencies
        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += 8 * (freq * (freq - 1) / 2); // 8 permutations per valid pair
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 4, 6};
        System.out.println(solution.tupleSameProduct(nums1)); // Output: 8
        
        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println(solution.tupleSameProduct(nums2)); // Output: 16
    }
}
