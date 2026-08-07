class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> li =new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++)
        {
            int val=(i^(i>>1));
            li.add(val);
        }
        return li;
    }
}
