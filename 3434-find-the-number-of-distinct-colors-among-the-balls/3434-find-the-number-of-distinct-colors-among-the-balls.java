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
    
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColors = new HashMap<>();
        Map<Integer, Integer> colorFrequency = new HashMap<>();
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            
            if (ballColors.containsKey(ball)) {
                int oldColor = ballColors.get(ball);
                colorFrequency.put(oldColor, colorFrequency.get(oldColor) - 1);
                if (colorFrequency.get(oldColor) == 0) {
                    colorFrequency.remove(oldColor);
                }
            }
            
            ballColors.put(ball, color);
            colorFrequency.put(color, colorFrequency.getOrDefault(color, 0) + 1);
            
            result[i] = colorFrequency.size();
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 4, 6};
        System.out.println(solution.tupleSameProduct(nums1)); // Output: 8
        
        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println(solution.tupleSameProduct(nums2)); // Output: 16
        
        int limit1 = 4;
        int[][] queries1 = {{1, 4}, {2, 5}, {1, 3}, {3, 4}};
        System.out.println(Arrays.toString(solution.queryResults(limit1, queries1))); // Output: [1, 2, 2, 3]
        
        int limit2 = 4;
        int[][] queries2 = {{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}};
        System.out.println(Arrays.toString(solution.queryResults(limit2, queries2))); // Output: [1, 2, 2, 3, 4]
        
        int limit3 = 1;
        int[][] queries3 = {{0, 1}, {1, 4}, {1, 1}, {1, 4}, {1, 1}};
        System.out.println(Arrays.toString(solution.queryResults(limit3, queries3))); // Output: [1, 2, 1, 2, 1]
    }
}