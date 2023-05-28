class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length==0) return true;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0; i<intervals.length-1; i++) {
            int start = intervals[i+1][0];
            int end = intervals[i][1];
            if(start<end) {
                return false;
            }
        }
        return true;
    }
}
