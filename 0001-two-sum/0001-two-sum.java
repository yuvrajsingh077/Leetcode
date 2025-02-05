import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number with its index
            map.put(nums[i], i);
        }
        
        return new int[]{}; // Should never be reached as per problem constraints
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] result1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Output: [0,1]

        int[] result2 = sol.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Output: [1,2]

        int[] result3 = sol.twoSum(new int[]{3, 3}, 6);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // Output: [0,1]
    }
}
