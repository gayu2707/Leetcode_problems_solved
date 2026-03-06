
public class Solution {

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // If needle is longer than haystack
        if (m > n) {
            return -1;
        }

        // Loop through haystack
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
