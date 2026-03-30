class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0,current =0 ;

        for(int i=0;i<prices.length;i++){
            
            for(int j=i+1;j<prices.length;j++){

                current = prices[j] - prices[i];

                maxProfit = Math.max(maxProfit,current);
            }
        }

        if(maxProfit < 0){
            return 0;
        }
        
        return maxProfit;
    }
}
