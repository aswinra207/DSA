class Solution {
    public int longestConsecutive(int[] nums) {
        int cs=1;
        int ms=1;
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                cs++;
            }else{
                ms=Math.max(cs,ms);
                cs=1;
            }
        }
        return Math.max(cs,ms);
        
    }
}