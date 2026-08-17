class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int cd=0;
        int min=Integer.MAX_VALUE;
        for(int i=k-1;i<nums.length;i++){
            cd=nums[i]-nums[i-k+1];
            min=Math.min(min,cd);
        }
       
        return min;
        
    }
}