import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
            List<Integer> left = new ArrayList<>();  // Pivot se chhote elements
                    List<Integer> mid = new ArrayList<>();   // Pivot ke barabar elements
                            List<Integer> right = new ArrayList<>(); // Pivot se bade elements

                                    // Step 1: Categorize elements
                                            for (int num : nums) {
                                                        if (num < pivot) {
                                                                        left.add(num);
                                                                                    } else if (num == pivot) {
                                                                                                    mid.add(num);
                                                                                                                } else {
                                                                                                                                right.add(num);
                                                                                                                                            }
                                                                                                                                                    }

                                                                                                                                                            // Step 2: Merge all lists into the original array
                                                                                                                                                                    int index = 0;
                                                                                                                                                                            for (int num : left) nums[index++] = num;
                                                                                                                                                                                    for (int num : mid) nums[index++] = num;
                                                                                                                                                                                            for (int num : right) nums[index++] = num;

                                                                                                                                                                                                    return nums;
                                                                                                                                                                                                        }

                                                                                                                                                                                                            // ✅ Testing the function
                                                                                                                                                                                                                public static void main(String[] args) {
                                                                                                                                                                                                                        Solution sol = new Solution();
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        int[] nums1 = {9, 12, 5, 10, 14, 3, 10};
                                                                                                                                                                                                                                                int pivot1 = 10;
                                                                                                                                                                                                                                                        System.out.println(Arrays.toString(sol.pivotArray(nums1, pivot1))); 
                                                                                                                                                                                                                                                                // Output: [9, 5, 3, 10, 10, 12, 14]

                                                                                                                                                                                                                                                                        int[] nums2 = {-3, 4, 3, 2};
                                                                                                                                                                                                                                                                                int pivot2 = 2;
                                                                                                                                                                                                                                                                                        System.out.println(Arrays.toString(sol.pivotArray(nums2, pivot2))); 
                                                                                                                                                                                                                                                                                                // Output: [-3, 2, 4, 3]
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    