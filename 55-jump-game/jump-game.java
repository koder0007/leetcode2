class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(i>max_reach){
                return false;}
                int curr = i + nums[i];
                if(curr>max_reach){
                    max_reach= curr;
                }
                if(max_reach >= len-1){
                    return true;
                }
            }
        
   return true ;}
}