class Solution {
    public int characterReplacement(String s, int k) {
        

        int left =0;
        int[] freq = new int[26];
        int maxLength = 0;
        int maxCount =0;


        for(int right=0;right<s.length();right++){

            char ch = s.charAt(right);

            freq[ch-'A']++;

            maxCount = Math.max(maxCount,freq[ch-'A']);

            int windowSize = right - left+1;

            if(windowSize - maxCount > k){

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
