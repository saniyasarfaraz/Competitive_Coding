//Link:https://leetcode.com/problems/process-string-with-special-operations-ii/?envType=daily-question&envId=2026-06-17
class Solution {
    public char processStr(String s, long k) {
        long len = 0;

        // Step 1: Find final length
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                len++;
            } else if (ch == '*') {
                if (len > 0) len--;
            } else if (ch == '#') {
                len *= 2;
            }
        }

        // If k is out of bounds
        if (k >= len) return '.';

        // Step 2: Reverse process
        boolean reversed = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (k == len - 1) {
                    return ch;
                }
                len--;
            } 
            else if (ch == '*') {
                len++;
            } 
            else if (ch == '#') {
                len /= 2;
                k %= len;
            } 
            else if (ch == '%') {
                k = len - 1 - k;
            }
        }

        return '.';
    }
}
