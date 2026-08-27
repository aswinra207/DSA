class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=nums[0];
        for(int i : nums){
            cs+=i;
        
            if(cs>ms) ms=cs;
            if(cs<0) cs=0;
        }
        return ms;
    }
}