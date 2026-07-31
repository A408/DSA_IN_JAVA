class Solution {
    public int[] sortedSquares(int[] nums) {
            // for (int i =0;i<nums.length;i++) {
            //     int temp = nums[i] * nums[i];
            //     nums[i]  = temp;
            // }
            // for(int i =0;i<nums.length;i++) {
            //     for(int j =i+1;j<nums.length;j++) {
            //         if(nums[j] < nums[i]) {
            //             int temp=nums[j];
            //             nums[j] = nums[i];
            //             nums[i] = temp;
            //         }
            //     }
            // }
            // return nums;
            int [] temp = new int[nums.length];
            int i =0;
            int j = nums.length -1;
            int k = nums.length -1;

            while (i<=j) {
                if(Math.abs(nums[i]) > Math.abs(nums[j]))  {
                    temp[k] = nums[i] *nums[i];
                    i++;
                }
                else {
                    temp[k] = nums[j] * nums[j];
                    j--;
                }
              k--;
             }
        return temp;
    }
}