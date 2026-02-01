class Solution {
    public boolean isSubsequence(String s, String t) {

        int s1 = s.length() - 1;
        int s2 = t.length() - 1;

        int i = 0; // count for s indexes
        int j = 0; // count for t indexes

        while (i <= s1 && j <= s2) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == s.length();

    }
}