class Solution {
    public int findElementAtIndex(int i, int[] arr) {
        // code here

        for(int j=0;j<arr.length;j++ ){
            if(i == j) {
                return arr[j];
            }
        }
       return -1;
        // return arr[i];
    }
}