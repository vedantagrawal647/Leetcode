class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        String s1="";
        String s2="";
        String s3="";
        
        if(l1>l2)
        {
            s1=num1.substring(l1-l2);
            s2=num2;
            s3=num1.substring(0,l1-l2);
        }
        else
        {
            s1=num1;
            s2=num2.substring(l2-l1);
            s3=num2.substring(0,l2-l1);
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        int c=0;
        Stack<Integer> obj=new Stack<>();
        for(int i=s1.length()-1;i>=0;i--)
        {
            int a=Integer.valueOf(s1.substring(i,i+1));
            int b=Integer.valueOf(s2.substring(i,i+1));
            int sum=a+b+c;
            int r=sum%10;
            c=sum/10;
            obj.push(r);
        }
        for(int i=s3.length()-1;i>=0;i--)
        {
            int a=Integer.valueOf(s3.substring(i,i+1));
            System.out.println(a);
            int sum=a+c;
            int r=sum%10;
            c=sum/10;
            obj.push(r);
        }
        String s4="";
        if(c!=0)
        {
             s4=""+c;
        }
        while(!obj.isEmpty())
        {
            s4=s4+obj.pop();
            
        }
        return s4;
    }
}