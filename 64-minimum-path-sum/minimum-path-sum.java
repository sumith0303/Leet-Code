class Solution {
    public int paths(int i,int j,int m,int n,int[][] obstacleGrid,int[][] dp){
        if(i==m-1 && j==n-1) return obstacleGrid[i][j];

        if(i>m-1 || j>n-1) return 1000000;

        // if(obstacleGrid[i][j]==1) return 0;

   
        if(dp[i][j]!=-1) return dp[i][j];

        int p1 = obstacleGrid[i][j] + paths(i+1,j,m,n,obstacleGrid,dp);
        int p2 = obstacleGrid[i][j] +paths(i,j+1,m,n,obstacleGrid,dp);

        return dp[i][j] = Math.min(p1,p2);
    }
    public int minPathSum(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m+1][n+1];
        for(int[] i: dp) Arrays.fill(i,-1);
        return paths(0,0,m,n,obstacleGrid,dp);
        
        
    }
}