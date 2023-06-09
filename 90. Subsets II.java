class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), res, 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> res, int start) {     
        for(int i=start; i<nums.length; i++) {
            if(i>start && nums[i]==nums[i-1]) continue; //skip duplicates
            temp.add(nums[i]);
            backtrack(nums, temp, res, i+1);
            temp.remove(temp.size()-1);
        }  
        res.add(new ArrayList<>(temp));
    }
}
