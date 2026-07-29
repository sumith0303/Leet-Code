class Solution {
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1;
        int maxx = -1;
        while(l<r){
            int minH = Math.min(height[l],height[r]);
            maxx =Math.max(maxx,(r-l)*minH);
            while(l<r && height[l]<=minH) l++;
            while(l<r && height[r]<=minH) r--;
        }
        return maxx;
        
    }
}