class Solution {
    int lowerBound(int[] arr, int target) {
        // code here

                int l =0;
                int r = arr.length-1;
                while(l<=r) {
                    int m = l+(r-l)/2;
                    if (arr[m] <target) { 
                         l = m+1;
                         }
                    else {
                        r= m-1;
                    }
                }
                return l;
            }
        }
