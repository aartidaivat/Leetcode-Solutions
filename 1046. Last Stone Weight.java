class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        int length = stones.length;
        if(length==1) return stones[0];
        for(int i=0; i<length; i++) {
            maxHeap.add(stones[i]);
        }
        stoneWeight(maxHeap); 
        if(maxHeap.size()==0) return 0;
        return maxHeap.poll();  
    }

    public void stoneWeight(PriorityQueue<Integer> maxHeap) {
        while(maxHeap.size()>1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x>y) maxHeap.add(x-y);
            if(x==y) maxHeap.add(0);
        }
    }
}
