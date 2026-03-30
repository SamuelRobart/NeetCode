class Solution {
    public boolean isPalindrome(String s) {

        if(s.isEmpty() || s == null){
            return false;
        }
        

        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");


        StringBuilder rev = new StringBuilder();
        for (int i = clean.length() - 1; i >= 0; i--) {
            rev.append(clean.charAt(i));
        }

        


        return clean.equals(rev.toString());
    }
}
