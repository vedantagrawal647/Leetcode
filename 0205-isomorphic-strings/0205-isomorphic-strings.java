class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> obj=new HashMap<>();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!obj.keySet().contains(c1))
            {
                if(!l.contains(c2))
                {
                    obj.put(c1,c2);
                    l.add(c2);
                }
                else
                {
                    return false;
                }
                
            }
            else
            {
                if(obj.get(c1)==c2)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}