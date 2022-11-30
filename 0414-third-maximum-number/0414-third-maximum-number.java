class Solution {
    public int thirdMax(int[] nums) {
       /* int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }*/
        List<Integer>  l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!l.contains(nums[i]))
            {
                l.add(nums[i]);
            }
           
        }
         Collections.sort(l);
            if(l.size()>=3)
            {
                return l.get(l.size()-3);
            }
            else
            {
                return l.get(l.size()-1);
            }
    }
}