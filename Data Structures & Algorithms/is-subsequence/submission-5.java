class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0 ){
            return true;
        }

        if( s == null || t == null){
            return false;
        }
            

        int j=0;

        for(int i=0;i<t.length();i++){

            if(j < s.length() && s.charAt(j) == t.charAt(i)){
                
                j++;
            }
        }

        
        return s.length() == j;
    }
}