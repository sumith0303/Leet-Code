class Solution {
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
        for(char ch: t.toCharArray()){
            freq[ch]++;
        }
        //freq reduce positive or 0 then increase count and if count == t.length valid window 
        // expand until count = t.length
        // shrink untill count remains t.length
        String ans = "";
        int l = 0,r=0,count = 0,startIndex = 0;
        int minLen = Integer.MAX_VALUE;
        while(r<s.length()){
            freq[s.charAt(r)]--;
            if(freq[s.charAt(r)]>=0) count++;
            while(count==t.length()){
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0) count--;
                if(minLen>r-l+1){
                    startIndex = l;
                    minLen = r-l+1;
                }
                l++;
            }    
        r++;

        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
        
    }
}