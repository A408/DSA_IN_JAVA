class Solution {
    private int bs(int[] nums, int target,boolean f) {
      int l=0;
     int r= nums.length-1;
     int ans= -1;
     while (l<=r){
            int m = l+(r-l)/2;
      if(nums[m] == target){
            ans =m;
            if (f){
                r = m-1;

            }
            else {
               l =m+1;
            }
      }
        else if (nums[m] < target) {
                l = m+1;
               
            }
            else {
                 r = m -1;
            }
      }
      return ans;
     }


    public int[] searchRange(int[] nums, int target)
    { 
        int fst =  bs(nums,target,true);
        int lst = bs(nums,target,false);
       
       return new int[]{fst,lst};
        }

        
    }