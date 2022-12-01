class Solution {
    public int[] replaceElements(int[] arr) {
        int[] right=new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);
        }
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=right[i];
            
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}