class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums==null || nums.length==0){
            return res;
        }
        Set<Integer> se = new HashSet<>();
        int min = nums[0];
        int max= nums[0];
        for(int i=0;i<nums.length;i++){
            se.add(nums[i]);
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
            
        }
        for(int i=min;i<=max;i++){
            if(!se.contains(i)){
                res.add(i);
            }
        }
        
        return res;
    }
}