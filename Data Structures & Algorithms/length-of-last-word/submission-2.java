class Solution {
    public int lengthOfLastWord(String str) {

        int right = str.length()-1;
        int count =0;

        while(0 <= right){

            if(str.charAt(right) != ' '){
                count++;
            }
            
            if(str.charAt(right) == ' ' && count > 0){
                return count;
            }

           right--;
        }
        
        return count;
    }
}