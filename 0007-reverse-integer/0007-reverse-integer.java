class Solution {
    public int reverse(int x) {
        String s=Integer.toString(x);
        String s1="";
        if(s.substring(0,1).equals("-"))
        {
            s1="-";
            s=s.substring(1,s.length());
        }
        for(int i=0;i<s.length();i++)
        {
            s1=s1+s.substring(s.length()-1-i,s.length()-i);
        }
        long j=Long.valueOf(s1);
        if(j > Integer.MAX_VALUE || j < Integer.MIN_VALUE)
        {
            return 0;
        }
        else
        {
            return Integer.valueOf(s1);
        }
    }
}