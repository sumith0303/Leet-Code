class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                l++;
                r++;
                break;
            }
            if(sum>target) r--;
            else l++;
        }
        int[] ans = {l,r};
        return ans;

        
    }
}