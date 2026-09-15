class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=Integer.MAX_VALUE;
        int l=0,sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                len=Math.min(len,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return (len==Integer.MAX_VALUE) ? 0 : len;
        
    }
}