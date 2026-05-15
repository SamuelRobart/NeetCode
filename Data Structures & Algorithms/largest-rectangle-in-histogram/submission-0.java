class Solution {
    public int largestRectangleArea(int[] heights) {

        int max = 0;
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<=heights.length;i++){

            int currentHeight = (i==heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){

                int height = heights[stack.pop()];

                int width;

                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() - 1;
                }

                int area = height * width;

                max = Math.max(area,max);
            }

            stack.push(i);
        }

        return max;
        
    }
}
