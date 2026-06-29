class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int r = 0;
        int[] freq = new int[256];
        int count=0;
        int max = 0;

        while(r<s.length()){
            freq[s.charAt(r)]++;
            
            while(freq[s.charAt(r)]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            count=r-l+1;
            if(count>max) max = count;

            r++;

        }
        return max;



        
        
    }
}