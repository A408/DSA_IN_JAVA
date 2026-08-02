class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum =0;
        int ml = Integer.MAX_VALUE;
        for(int r = 0;r<nums.length;r++) {
                sum += nums[r];
            while(sum >= target){
                ml = Math.min(ml,r-l+1);
                sum = sum  - nums[l];
                l++;
            }
        }
            if (ml == Integer.MAX_VALUE) {
    return 0;
}

        
        return ml;
    }
}