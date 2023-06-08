class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),res,0);
        return res;
    }
  
    public void backtrack(int[] nums, List<Integer> list, List<List<Integer>> res, int start) {
        for(int i=start; i<nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums,list,res,i+1);
            list.remove(list.size()-1);
        }
        res.add(new ArrayList<>(list));
    }
}
