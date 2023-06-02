class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int res = 1;
        int[] forward = new int[length];
        int backward = 1;
        for(int i=0; i<length; i++) {
            res = res * nums[i];
            forward[i] = res;
        }
        for(int i=length-1; i>0; i--) {
            forward[i] = backward * forward[i-1];
            backward = backward * nums[i];
        }
        forward[0] = backward;   
        return forward;
    }
}
