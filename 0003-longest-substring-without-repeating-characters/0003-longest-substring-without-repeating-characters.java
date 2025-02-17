import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        backtrack(tiles, "", visited, set);
        return set.size();
    }
    
    private void backtrack(String tiles, String current, boolean[] visited, HashSet<String> set) {
        if (!current.isEmpty()) {
            set.add(current);
        }
        
        for (int i = 0; i < tiles.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(tiles, current + tiles.charAt(i), visited, set);
                visited[i] = false;
            }
        }
    }
    
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}