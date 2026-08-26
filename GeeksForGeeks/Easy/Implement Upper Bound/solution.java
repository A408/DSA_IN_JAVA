class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int l =0;
        int r = arr.length-1;
        while(l<=r) {
            int m = l+(r-l)/2;
            if (arr[m] > target) { 
                r = m-1;
                
            }
            else {
                l= m+1;
            }
        }
        return l;
    }
}
