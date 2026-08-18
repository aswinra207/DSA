class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count=0;
        int n = nums.length;
        ArrayList res = new ArrayList<>();
        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            count=1;
            for(int j=i+1;j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3){
                res.add(nums[i]);
            }
            i =i+ (count - 1); 
        }
        return res;  
    }
}