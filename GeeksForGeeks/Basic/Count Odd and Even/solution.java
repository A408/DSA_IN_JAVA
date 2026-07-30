class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n = arr.length;
        int countevn=0;
        int countod=0;
        for(int i =0;i<n;i++){
                if(arr[i]%2==0){
                    countevn++;
                    
                }
                else {
                    countod++;
                }
        }
        return new int[] {countod, countevn};
    }
}