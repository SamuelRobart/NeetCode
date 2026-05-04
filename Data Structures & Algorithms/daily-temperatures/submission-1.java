class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int len = temperatures.length;
        int[] res = new int[len];

        for(int i=0;i<len;i++){

            int count =1;

            for(int j=i+1;j<len;j++){

                if(temperatures[i] < temperatures[j]){
                    res[i] = count;
                    break;
                }
                count++;
            }
        }
        

        return res;
    }
}
