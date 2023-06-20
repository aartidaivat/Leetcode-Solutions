class Candidate {
    double d;
    int i;
    public Candidate(double dist, int index) {
        this.d = dist;
        this.i = index;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Candidate> minHeap = new PriorityQueue<>((a,b)->Double.compare(a.d, b.d));
        for(int i=0; i<points.length; i++) {
            double d = getDistance(points[i][0], points[i][1]);
            Candidate c = new Candidate(d,i);
            minHeap.add(c);
        }
        int[][] result = new int[k][2];
        int i = 0;
        while(!minHeap.isEmpty() && k>0) {
            Candidate c = minHeap.poll();
            result[i++] = points[c.i];
            k--;
        }
        return result;           
    }

    public double getDistance(int x, int y) {
        return Math.sqrt((x*x)+(y*y));
    }
    
}
