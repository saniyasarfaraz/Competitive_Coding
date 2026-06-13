//link:https://leetcode.com/problems/weighted-word-mapping/?envType=daily-question&envId=2026-06-13
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";

        for (String s : words) {
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                sum += weights[idx];
            }

            int r = sum % 26;
            result += (char)('z' - r);
        }

        return result;
    }
}
