class Solution {
    public int rob(int[] nums) {
        int max1=0;
        int max=0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i : nums){
            int maxx=Math.max(max,max1+i);
            max1=max;
            max=maxx;
        }
        return max;
    
    }
}