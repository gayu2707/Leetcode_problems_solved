class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int r = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            arr[r].append(s.charAt(i));
            if (r == numRows - 1) {
                down = false;
            } else if (r == 0) {
                down = true;
            }
            if (down) {
                r++;
            } else {
                r--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
