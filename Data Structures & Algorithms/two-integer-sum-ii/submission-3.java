class Solution {
    public int[] twoSum(int[] arr, int target) {

       // Optimise -> Two Pointer Approach

       int left = 0,right = arr.length-1;

       while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[] {left+1,right+1};

            }else if(sum < target){
                left++;

            }else if(target < sum){
                right--;
            }

           
       }

        return new int[]{0,0};
        
    }
}
