class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int len = s.length();
        int i;
        for(i=len-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            else 
            {
                break;
            }
        }
        return count;
        
    }
}