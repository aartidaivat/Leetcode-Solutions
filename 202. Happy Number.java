class Solution {
    public boolean isHappy(int n) {  
        int temp=0;
        while(n!=0) {
            int x=n%10;
            n=n/10;
            temp += x*x;
        }
        n=temp;
        if(n<10) {
            if(n==1 || n==7) {
                return true;
            } 
            return false;   
        }
        return isHappy(n);
    }
}
