class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for(int i=1;i<numRows;i++){
            helper(res.get(i-1));
        }
        return res;
    }

    private void helper(List<Integer> previousLevel){
        int i=0,k=0, size = previousLevel.size();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        while(k<size-1){
            temp.add(previousLevel.get(i)+previousLevel.get(i+1));
            k++;
            i++;
        }
        temp.add(1);
        res.add(temp);
    }

}
