class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int pre=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=pre;
            pre*=nums[i];
        }
        int suff=1;
        for(int i=nums.length-1;i>=0;i--){
            prefix[i]*=suff;
            suff*=nums[i];
        }
        return prefix;
    }
}