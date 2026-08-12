class Solution {
    public void backTrack(int start,int[] nums,List<Integer> path,List<List<Integer>> res){

        res.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){

            if(i>start && i>=1 && nums[i]==nums[i-1]) continue; //skipping same element at same level

            path.add(nums[i]);
            backTrack(i+1,nums,path,res);
            //backTrack
            path.remove(path.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backTrack(0,nums,new ArrayList<>(),res);
        return res;


        
    }
}