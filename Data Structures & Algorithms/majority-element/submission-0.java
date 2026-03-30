class Solution {
    public int majorityElement(int[] nums) {

       int repeat = 0;
       int count =0;

       for(int num: nums){
            if(count == 0){
                repeat = num;
            }

            if(repeat == num){
                count++;
            }else{
                count--;
            }

       }

       return repeat;
    }

}