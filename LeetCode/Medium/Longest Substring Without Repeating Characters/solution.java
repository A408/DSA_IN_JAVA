import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            // Remove characters until there is no duplicate
            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }

            // Add current character
            set.add(ch);

            // Update maximum length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}