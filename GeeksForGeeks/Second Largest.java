class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         int largest = -1;
         int secondlargest =-1;
         
         for(int i =0;i<arr.length;i++) {
             if(arr[i] > largest) {
                 largest = arr[i];
             }
             
         }
          for(int i =0;i<arr.length;i++)  {
              if(arr[i] > secondlargest && arr[i] != largest) {
                   secondlargest =  arr[i];
              }
          }
          return secondlargest;
    }
}