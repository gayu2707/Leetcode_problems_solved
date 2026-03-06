class Solution {
    public String longestCommonPrefix(String[] strs) {

        // If array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String prefix = strs[0];

        // Compare with remaining strings
        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                
                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
