class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, n=nums.length;
        while(i<n) {
            if(nums[i]==val) {
                nums[i]=nums[n-1];
                n -= 1;
            }
            else {
                i++;
            }
        }
        return n;
    }
}
