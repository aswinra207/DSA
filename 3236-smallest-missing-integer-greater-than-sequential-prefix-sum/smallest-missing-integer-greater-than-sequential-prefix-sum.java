class Solution {
    public int missingInteger(int[] nums) {
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for (int num : nums){
            res.add(num);
        }
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i - 1] + 1){
                 n+=nums[i];
            }else{
                break;
            }
            
        }

        while(res.contains(n)){
            n++;
        }
        return n;
    }
}