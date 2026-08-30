class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int c =0;
        int num =1;
        while(c<k){
        boolean f = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                f = true;
                break;
            }
        }
           if (!f) {
                c++;

                if (c == k) {
                    return num;
                }
           }

            num++;
        }

        return -1;

    }
}