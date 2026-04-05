class Solution {
    public int[] replaceElements(int[] arr) {
        

        int len = arr.length;
       
        
        
        for(int i=0;i<len;i++){
            int max=0;
            for(int j=i+1;j<len;j++){
                
                max =Math.max(arr[j],max);
            }

            arr[i] = max;
        }

        arr[len-1] = -1;

        return arr;
    }
}