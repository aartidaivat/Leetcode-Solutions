class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0, carry=0;
        int i=digits.length-1;
        sum=1+digits[i];
        int value=(sum+carry)%10;
        carry=(sum+carry)/10;
        int[] res = new int[digits.length+1];
        res[i+1]=value;
        i=digits.length-2;
        while(i>=0) {
            sum=digits[i];
            value=(sum+carry)%10;
            carry=(sum+carry)/10; 
            res[i+1]=value;
            i--;
        }
        if(carry!=0) {
            res[0]=carry;
            return res;
        }
        int[] nums = new int[res.length-1];
        int j=0;
        while(j<nums.length) {
            nums[j]=res[j+1];
            j++;
        }
        return nums;
    }   
}
