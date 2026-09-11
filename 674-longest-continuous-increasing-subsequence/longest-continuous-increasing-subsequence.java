class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cnt=1,res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                cnt++;
                res=Math.max(res,cnt);
            }else{
                cnt=1;
            }
        }
        return res;
    }
}