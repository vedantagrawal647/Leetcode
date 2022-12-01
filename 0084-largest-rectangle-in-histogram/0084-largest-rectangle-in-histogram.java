class Solution {
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