class Solution {
    String m,m1;
    public int numWays(int i,String s,int[] dp){
        if(i==s.length()){
            return 1;
        }
        
        //pick 1
        if(dp[i]!=-1) return dp[i];
        int p1=0,p2=0;
        if(i+1<s.length()){
            m = s.charAt(i)+""+s.charAt(i+1);
            int num = Integer.parseInt(m);
            if(num<=26 && num>=10 ) p1= numWays(i+2,s,dp);

        }
        m1 = s.charAt(i)+"";
        int num2 = Integer.parseInt(m1);
        if(num2==0) return 0;
        
        p2= numWays(i+1,s,dp);
        return dp[i] = p1+p2;


    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        // if(s.charAt(0)=='0') return 0;
        return numWays(0,s,dp);
        
        
    }
}