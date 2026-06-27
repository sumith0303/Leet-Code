class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int x = m+n;
        int p1= 0,p2=0,i=0;
        while(p1<m || p2<n){
            if(p1>=m){
                nums[i] = nums2[p2];
                // System.out.println("2");
                p2++;

            }
            else if(p2>=n){
                nums[i] = nums1[p1];
                // System.out.println("1");
                p1++;

            }
            else if (nums1[p1]<=nums2[p2]){
                nums[i] = nums1[p1];
                // System.out.println("1");
                p1++;
            }
            else{
                nums[i] = nums2[p2];
                // System.out.println("2");
                p2++;
            }
            // System.out.println(Arrays.toString(nums));
            i++;
        }
        double ans  = 0.00;
        if((m+n)%2==0) ans = (double) (nums[x/2] + nums[(x/2)-1])/2;
        else ans = nums[x/2];
        return ans;
        
    }
}