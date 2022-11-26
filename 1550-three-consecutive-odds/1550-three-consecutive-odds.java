class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int u=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                u=0;
            }
            else
            {
                u=u+1;
            }
            if(u>=3)
            {
                return true;
            }
        }
        return false;
        
    }
}