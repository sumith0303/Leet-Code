class Solution {
    public void backTrack(int[] candidates,int start,int target,ArrayList<Integer> path,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]){ //skip the elements
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            path.add(candidates[i]);
            backTrack(candidates,i+1,target-candidates[i],path,res);
            path.remove(path.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
       
        Arrays.sort(candidates);
        backTrack(candidates,0,target,new ArrayList<Integer>(),res);

        return res;   
    }
}