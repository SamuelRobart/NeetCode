class Solution {
    public int firstUniqChar(String str) {
        
        Map<Character,Integer> map = new HashMap<>();

        int len = str.length();
        int i =0;

        while(i<len){
            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }

            i++;
        }

        for(i=0;i<len;i++){

            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}