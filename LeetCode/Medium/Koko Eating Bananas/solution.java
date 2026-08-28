class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];

for (int i = 1; i < piles.length; i++) {
    if (piles[i] > max) {
        max = piles[i];
    }
}
        int l=1;
        int r =max;
        while(l<r){
            int m = l + (r - l) / 2;
            int hr  =0;
            for (int i = 0; i < piles.length; i++) {
            hr += (piles[i] + m - 1) / m;

        }
         if (hr <= h) {
            r =m;
         }
         else {
            l = m+1;
         }
        }
        return l;

        
    }
}