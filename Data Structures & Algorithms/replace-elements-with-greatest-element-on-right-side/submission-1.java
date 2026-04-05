class Solution {
    public int[] replaceElements(int[] arr) {
        

        //Optmise Version

        int[] res = new int [arr.length];
        int right = arr.length-1;
        int j = right-1;
        int max = arr[right];

        while(right > 0){

            max = Math.max(arr[right], max);
            res[j--] = max;
            right--;
        }

        res[arr.length-1] = -1;
        return res;
    }
}