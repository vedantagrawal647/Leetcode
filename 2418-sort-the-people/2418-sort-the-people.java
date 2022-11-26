class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int l=heights.length;
        Map<Integer,Integer> obj=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            obj.put(heights[i],i);
        }
        Arrays.sort(heights);
        String[] arr=new String[l];
        
        for(int i=0;i<l;i++)
        {
            arr[l-1-i]=names[obj.get(heights[i])];
        }
        return arr;
    }
}