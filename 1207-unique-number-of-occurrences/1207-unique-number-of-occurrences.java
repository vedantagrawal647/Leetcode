class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> obj=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:arr)
        {
            if(!obj.keySet().contains(i))
            {
                obj.put(i,1);
                l.add(i);
            }
            else
            {
                int d=obj.get(i)+1;
                obj.put(i,d);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            int e=obj.get(l.get(i));
            if(!l2.contains(e))
            {
                l2.add(e);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}