class Solution {
    public boolean isHappy(int n) {  
        Set<Integer> set = new HashSet<>();
        while(n!=1) {
            int temp=0;
            while(n!=0) {
                int x=n%10;
                n=n/10;
                temp += x*x;
            }
            n=temp;
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
        }  
        return true;
    }
}

