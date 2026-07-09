class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k%=n;
        rev(arr,0,n-1);
         rev(arr,0,k-1);
          rev(arr,k,n-1);
        
    }
    void rev (int[]arr,int s,int e)
     {
         while(s < e) {
         int temp = arr[s];
         arr[s]  = arr[e];
         arr[e] = temp;
         s++;
         e--;
     }
    }
}