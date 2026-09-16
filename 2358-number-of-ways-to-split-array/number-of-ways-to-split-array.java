class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0,n=nums.length;
        long sum=0,left=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            left+=nums[i];
            sum-=nums[i];

            if(left>=sum) count++;
        }

        return count;
        
        
    }
}