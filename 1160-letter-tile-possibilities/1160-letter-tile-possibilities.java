import java.util.HashSet;

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
}