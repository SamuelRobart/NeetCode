class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int len = temperatures.length;
        int[] res = new int[len];

        Stack <Integer> stack = new Stack();

        for(int i=0;i<len ;i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){

                int preIndex = stack.pop();

                res[preIndex] = i - preIndex;
            }

            stack.push(i);
        }
        

        return res;
    }
}
