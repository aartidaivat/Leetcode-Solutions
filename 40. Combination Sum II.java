class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,new ArrayList<>(),res,0);
        return res;
    }

    public void backtrack(int[] candidates, int target, List<Integer> temp, List<List<Integer>> res, int start) {
        if(target<0) return;  
        if(target==0) {
            res.add(new ArrayList<>(temp));
        }
        for(int i=start; i<candidates.length; i++) {
            if(i>start && candidates[i]==candidates[i-1]) continue; //skip duplicates
            temp.add(candidates[i]);
            backtrack(candidates,target-candidates[i],temp,res,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
