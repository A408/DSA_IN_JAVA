class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        
        int s=0;
        for(int e =0; e <arr.length;e++) {
            if(arr[e] != 0) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
            }
                
            }
        }
                 
            }