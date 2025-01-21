class Solution {
    public String largestOddNumber(String num) {
        // Traverse the string from the end to the beginning
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character represents an odd number
            char c = num.charAt(i);
            if ((c - '0') % 2 != 0) {
                // Return the substring from the start to the current index (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd number is found, return an empty string
        return "";
    }
}
