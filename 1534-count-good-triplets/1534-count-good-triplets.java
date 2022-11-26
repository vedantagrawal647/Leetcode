class Solution {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int u=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(m1(nums,a,i,j))
                {
                    for(int k=j+1;k<nums.length;k++)
                    {
                        if(m1(nums,c,i,k) && m1(nums,b,j,k))
                        {
                            u=u+1;
                        }
                    }
                }
                
            }
        }
        return u;
    }
    public boolean m1(int nums[],int k,int m,int n)
    {
        int d=nums[m]-nums[n];
        if(d<0)
        {
            d=d*(-1);
        }
        if(d<=k)
        {
            return true;
        }
        return false;
    }
}