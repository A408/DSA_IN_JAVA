class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int max = time[0];
        for (int i = 1; i < time.length; i++) {
    if (time[i] < max) {
        max = time[i];
    }
}
        long l = 1;
        long r = (long)max *totalTrips;
        while( l<r){
            long m = l+(r-l)/2;
           long  ct =0;
            for(int i=0;i<time.length;i++){
                ct+=m/time[i];
            }
            if(ct >= totalTrips){
                r=m;
            }
            else {
                l = m+1;
        
            }

        }
        return l;
        
    }
}