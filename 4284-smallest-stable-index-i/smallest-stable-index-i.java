class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length==1) return 0;
        int maxy=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxy=Math.max(maxy,nums[i]);
            int mins=nums[i];
            for(int j=i;j<nums.length;j++){
                mins=Math.min(mins,nums[j]);
            }
            int c = maxy-mins;
            if(c<=k) {
                return i;
            }
        }
        return -1;
    }
}