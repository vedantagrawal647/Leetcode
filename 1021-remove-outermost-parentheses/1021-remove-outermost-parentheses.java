class Solution {
    public String removeOuterParentheses(String s) {
        List<String> l=new ArrayList<>(); 
        String s1="";
        m1(s,l);
        for(int i=0;i< l.size();i++)
        {
            s1=s1+l.get(i);
        }
        return s1;
    }
    public void m1(String s,List<String> l)
    {
        Stack<Character> obj=new Stack<>();
        String s1="";
        int u=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(u==0)
                {
                     u=u+1;
                    continue;
                }
                else
                {
                    //System.out.println(s1);
                    s1=s1+s.charAt(i);
                    u=u+1;
                    
                }
            }
            else
            {
                if(u==1)
                {
                    l.add(s1);
                    s1="";
                    u=0;
                    continue;
                }
                else
                {
                    s1=s1+s.charAt(i);
                    u=u-1;
                }
                
            }
        }
    }
}