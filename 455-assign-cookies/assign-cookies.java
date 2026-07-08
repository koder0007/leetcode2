class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int glen = g.length;
        int slen = s.length;
        int i=0,j=0;
        while(i<glen && j<slen){
            if(g[i]<=s[j]){
                i++;
                j++;
                
            }
            else{
                j++;
            }
        }
        return i;
    }
}