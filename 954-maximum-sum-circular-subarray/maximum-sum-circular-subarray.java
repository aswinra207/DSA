class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
        }
        int gsmin=nums[0],csmin=nums[0];
        int gsmax=nums[0],csmax=nums[0];
        for(int j=1;j<nums.length;j++){
            csmax=Math.max(csmax+nums[j],nums[j]);
            gsmax=Math.max(csmax,gsmax);

            csmin=Math.min(csmin+nums[j],nums[j]);
            gsmin=Math.min(csmin,gsmin);
        }
        if(gsmax<0){
            return gsmax;
        }
        return Math.max(gsmax,t-gsmin);
    }
}