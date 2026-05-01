class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        int open=0,close=0;

        String current ="";

        backtrack(n,current,open,close,result);

        return result;
        
    }

    public void backtrack(int n,String current,int open,int close, List<String> result){

        if(current.length() == n*2){

            result.add(current);
            return;
        }


        if(open < n){

            backtrack(n,current+"(",open+1,close,result);
        }

        if(close < open){
            backtrack(n,current+")",open,close+1,result);
        }
    }
}
