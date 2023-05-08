class Solution {
    public int findDuplicate(int[] nums) {
        int length=nums.length;
        for(int i=0; i<length; i++) {
            int idx=Math.abs(nums[i]);
            if(nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }  
        return length;
    }
}
