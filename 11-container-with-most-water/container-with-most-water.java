class Solution {
    public int maxArea(int[] height) {
        int len =height.length;
        int maxArea =0;
        int left =0;
        int right = len-1;
       while(left<right){
          int width = right - left ; 
          int ht = (height[left]<height[right])?height[left]:height[right];
          int area  = width * ht;
          if(height[left]<height[right]){
            left++;
          }
          else{
            right--;
          }
          maxArea = (maxArea > area)?maxArea:area;
       }
        return maxArea;
    }
}