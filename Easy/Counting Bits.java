class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int rem = 0;
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            int m = i;
            while (m > 0) {
                rem = m % 2;
                if (rem == 1) {
                    result[i]++;
                } else {
                    result[i] += rem;
                }
                m = m / 2;
            }
        }
        return result;
    }
}