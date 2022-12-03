class Solution {
    public String frequencySort(String s) {
        int l1=s.length();
        HashMap<String,Integer> obj=new HashMap<>();
        List<String> l=new ArrayList<>();
        for(int i=0;i<l1;i++)
        {
            String s1=s.substring(i,i+1);
            if(!obj.keySet().contains(s1))
            {
                obj.put(s1,1);
                l.add(s1);
            }
            else
            {
                int g=obj.get(s1);
                g+=1;
                obj.put(s1,g);
            }
        }
        
        String ss="";
        while(l.size()!=0)
        {
            int l2=l.size();
            int max=Integer.MIN_VALUE;
            int index=0;
            for(int i=0;i<l2;i++)
            {
                if(obj.get(l.get(i))>max)
                {
                    max=obj.get(l.get(i));
                    index=i;
                }
                else if(obj.get(l.get(i))==max)
                {
                    char c1=l.get(index).charAt(0);
                    char c2=l.get(i).charAt(0);
                    if(c1>c2)
                    {
                        index=i;
                    }
                }
                
            }
            for(int i=0;i<obj.get(l.get(index));i++)
            {
                ss=ss+l.get(index);
            }
            l.remove(index);
        }
        return ss;
        
    }
}