class Solution {
    public int firstStableIndex(int[] nums, int k) {
 int[] pMax = new int[nums.length];
int[] sMin = new int[nums.length];
pMax[0]=nums[0];
for(int i=1;i<nums.length;i++){
    pMax[i] = Math.max(nums[i],pMax[i-1]);
}
sMin[nums.length-1]=nums[nums.length-1];
for(int i=nums.length-2;i>=0;i--){
    sMin[i] = Math.min(nums[i],sMin[i+1]);    
    }

    for(int i=0;i<nums.length;i++){
      int  instb = pMax[i] - sMin[i];
        if(instb <= k){
            return i;
        }
    }
    return -1;
    }
}