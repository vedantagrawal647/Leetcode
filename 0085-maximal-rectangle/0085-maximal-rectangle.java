class Solution {
    public int maximalRectangle(char[][] matrix)
    {
        
        int max=0;
        
        for(int i=matrix.length-1;i>=0;i--)
        {
            int[] arr=new int[matrix[0].length];
            for(int j=0; j<matrix[0].length; j++) 
             {
                 int u=0;
                 for(int k=i;k<matrix.length;k++)
                 {
                     if(matrix[k][j]=='0')
                     {
                         break;
                     }
                     else
                     {
                         u=u+1;
                     }
                 }
                 arr[j]=u;
             }
            int area=largestRectangleArea(arr);
            max=Math.max(area,max);
        }
        return max;
    }
     public int largestRectangleArea(int[] heights) {
        Stack<Integer> obj =new Stack<>();
        int max=0;
        int[] arr=new int[heights.length+1];
        for(int i=0;i<heights.length;i++)
        {
            arr[i]=heights[i];
        }
        arr[heights.length]=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(obj.isEmpty() || arr[i]>=arr[obj.peek()])
            {
                obj.push(i);
            }
            else
            {
                while(!obj.isEmpty() && arr[i]<arr[obj.peek()])
                {
                    int end=i;
                    int a=arr[obj.pop()];
                    
                    if(obj.isEmpty())
                    {
                        int start=0;
                        int area=a*(end-start);
                        max=Math.max(area,max);
                    
                    }
                    else
                    {
                    
                        int start=obj.peek();
                        int area=a*(end-start-1);
                        max=Math.max(area,max);
                    }
                    
                }
                obj.push(i);
                
                
            }
            
        }
        return max;
    }
   
}