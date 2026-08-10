class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i:nums){
            int count=1;
            for(int j=1;j<nums.length;j++){
                if(i==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                return i;
            }
        }
        return -1;
    }
}