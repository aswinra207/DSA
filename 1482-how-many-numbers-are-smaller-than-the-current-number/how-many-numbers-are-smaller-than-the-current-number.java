class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int k=0;
        for(int i : nums){
            int count=0;
            for(int j :nums){
                 if(i>j){
                    count++;
                }
            }
           ans[k]= count;
           k++;
        }
        return ans;
    }
}