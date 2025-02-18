import java.util.Stack;

class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);
            
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestNumber("IIIDIDDD")); // Output: "123549876"
        System.out.println(solution.smallestNumber("DDD")); // Output: "4321"
    }
}