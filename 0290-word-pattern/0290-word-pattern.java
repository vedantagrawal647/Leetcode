class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ch=s.split(" ");
        if(ch.length!=pattern.length())
        {
            return false;
        }
        Map<String,Character> obj=new HashMap<>();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<ch.length;i++)
        {
            String c1=ch[i];
            char c2=pattern.charAt(i);
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