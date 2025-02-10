public class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (true) {
            int digitIndex = -1;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }
            
            if (digitIndex == -1) {
                break; // No more digits left
            }
            
            // Find the closest non-digit character to the left
            int removeIndex = -1;
            for (int i = digitIndex - 1; i >= 0; i--) {
                if (!Character.isDigit(sb.charAt(i))) {
                    removeIndex = i;
                    break;
                }
            }
            
            if (removeIndex != -1) {
                sb.deleteCharAt(removeIndex); // Remove the non-digit character
                digitIndex--; // Adjust the digit index after removal
            }
            
            sb.deleteCharAt(digitIndex); // Remove the digit
        }
        
        return sb.toString();
    }
}
