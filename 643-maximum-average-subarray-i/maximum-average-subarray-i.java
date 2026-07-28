class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return (double)nums[0];
        }
        double gs=0;
        for(int i=0; i<k;i++){
            gs+=nums[i];
        }
        double cs=gs;
        for(int i=k;i<nums.length;i++){
            cs=cs+nums[i]-nums[i-k];
            if(cs>gs){
                gs=cs;
            }
        }
        return gs/k;
        
        
    }
}