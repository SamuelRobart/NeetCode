class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> res =new HashMap<>();

        for(String s : strs){

            char [] charArray = s.toCharArray();

            Arrays.sort(charArray);

            String sSort = new String(charArray);

            res.putIfAbsent(sSort,new ArrayList<>());
            res.get(sSort).add(s);
        }
        
        return new ArrayList<>(res.values());
    }
}
