class Solution {
    public void backTrack(int start,int target,int[] candidates,List<Integer> path,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        if(start == candidates.length){
            return;
        }
        if(target<candidates[start]){
            return;
        }

        path.add(candidates[start]);
        backTrack(start,target-candidates[start],candidates,path,res);
        //backTrack
        path.remove(path.size()-1);
        backTrack(start+1,target,candidates,path,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backTrack(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }


}