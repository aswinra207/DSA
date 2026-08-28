class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int d=0;
        int mins=Integer.MAX_VALUE;
        for(int i=k-1;i<nums.length;i++){
            d=nums[i]-nums[i-k+1];
            mins = Math.min(mins,d);
        }
        return mins;
        
    }
}