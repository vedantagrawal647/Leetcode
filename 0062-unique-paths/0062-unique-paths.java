class Solution {
    
    
    public int uniquePaths(int m,int n)
    {
        int[][] arr=new int[m][n];
        int res=m1(arr,m,n);
        return res;
        
    }
    public int m1(int[][] arr,int l,int b)
    {
        arr[0][0]=1;
        for(int j=1;j<b;j++)
        {
             arr[0][j]=arr[0][j-1];
        }
        for(int i=1;i<l;i++)
        {
            
            arr[i][0]=arr[i-1][0];
        }
        for(int i=1;i<l;i++)
        {
            for(int j=1;j<b;j++)
            {
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        
        return arr[l-1][b-1];
    
    }
}