class Solution {
    public String removeOccurrences(String s, String part) {
        int index;
        while ((index = s.indexOf(part)) != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1:
        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        String result1 = solution.removeOccurrences(s1, part1);
        System.out.println("Input: s = \"" + s1 + "\", part = \"" + part1 + "\"");
        System.out.println("Output: \"" + result1 + "\""); // Output: "dab"

        // Example 2:
        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        String result2 = solution.removeOccurrences(s2, part2);
        System.out.println("Input: s = \"" + s2 + "\", part = \"" + part2 + "\"");
        System.out.println("Output: \"" + result2 + "\""); // Output: "ab"
    }
}
