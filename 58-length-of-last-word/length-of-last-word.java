class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLen=0;
        int n = s.length();
        for(int i =n-1; i>=0; i--){
         if(s.charAt(i) == ' ')
         continue;
         else{
            
                lastWordLen++;
                if(  i !=0 && s.charAt(i-1) == ' ' )
                return lastWordLen;
            
         }
          
        }
        return lastWordLen;
    }
}