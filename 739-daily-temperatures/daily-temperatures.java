class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer =new int [temperatures.length];
        Stack <Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.empty()&& temperatures[stack.peek()]<temperatures[i]){
                Integer pop = stack.pop();
                answer[pop] = i-pop;

            }
            stack.push(i);
        }
        return answer;
    }
}