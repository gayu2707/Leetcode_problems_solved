class Solution {
    public int[] canSeePersonsCount(int[] h) {
        
        int n=h.length;
        int[] A=new int[n];
        int[] S=new int[n];
        int t=-1;
        for(int i=n-1;i>=0;i--)
        {
            int ch=h[i];
            while(t>=0&&S[t]<ch)
            {
                A[i]++;
                t--;
            }
            if(t>=0)
            {
                A[i]++;
            }
            S[++t]=ch;
        }
        return A;
    }
}
