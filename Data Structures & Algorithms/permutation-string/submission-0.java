class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() == 0 || s2.length() == 0){
            return false;
        }

        int [] windowscount = new int [26];
        int [] s1count = new int [26];

        for(int i =0;i<s1.length();i++){
            s1count [s1.charAt(i) - 'a']++;
        }

        int windowsize = s1.length();

        for(int i=0;i<s2.length();i++){

            windowscount[s2.charAt(i) - 'a']++;

            if(i >= windowsize){

                windowscount[s2.charAt(i - windowsize) - 'a']--;
            }

            if(match(s1count, windowscount)){
                return true;
            }
        }
        
        return false;
    }

    public boolean match(int[] s1count, int [] windowscount){

        for(int i=0;i<26;i++){

            if(s1count[i] != windowscount[i]){
                return false;
            }
        }

        return true;
    }
}
