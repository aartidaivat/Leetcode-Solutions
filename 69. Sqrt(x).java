class Solution {
    public int mySqrt(int x) {
        long left = 0, right = x/2, res=0;
        int sol = 0;
        if(x==0 || x==1) return x;
        while(right>=left) {
            long mid = (left+right)/2;
            if((mid*mid)>x) {
                right = mid-1;
            }
            else if((mid*mid)<x) {
                left = mid+1;
                res = mid;
                sol = (int)res;
            }
            else {
                int ans = (int)mid;
                return ans;
            }
        }
        return sol;
    }
}
