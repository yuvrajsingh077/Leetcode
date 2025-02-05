class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // If the strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        int first = -1, second = -1;
        int count = 0;
        
        // Find indices where s1 and s2 differ
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (first == -1) {
                    first = i;  // First mismatch index
                } else if (second == -1) {
                    second = i; // Second mismatch index
                } else {
                    return false; // More than 2 mismatches
                }
            }
        }

        // There should be exactly 2 differences, and swapping should make them equal
        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.areAlmostEqual("bank", "kanb"));  // true
        System.out.println(sol.areAlmostEqual("attack", "defend")); // false
        System.out.println(sol.areAlmostEqual("kelb", "kelb"));  // true
    }
}
