class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            int a=nums[i];
            int b=target-a;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==b)
                {
                    int[] arr =new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
                else
                {
                    continue;
                }
            }
        }
        return nums;
        
    }
}