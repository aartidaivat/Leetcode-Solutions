class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int diff=0;
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++) {
            diff=target-nums[i];
            if(map.containsKey(diff)) {
                int index=map.get(diff);
                if(i!=index) {
                    return new int[] {i,index};
                }
            }    
        }
        return new int[] {-1,-1};
    }
}
