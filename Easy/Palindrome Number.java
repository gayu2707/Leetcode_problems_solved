class Solution{
    int r,sum=0;
    public boolean isPalindrome(int x) {
        int num = x;
        while(x>0){
            r = x%10;
            x = x/10;
            sum =(sum *10)+r ;
        }
        if(sum==num)
        {
            return true;
        }
        else
            return false;       
    }
}