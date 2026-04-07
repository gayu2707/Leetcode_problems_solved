class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[58]; // as per ascii values A(65) to z(122)

        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 65] += 1; // store count of each letter
        }

        int longestPal = 0;
        for(int i = 0; i < 58; i++) {
            longestPal += (arr[i] / 2) * 2; // add largest multiple of 2
        }

        return longestPal < s.length() ? longestPal + 1 : longestPal;
    }
}