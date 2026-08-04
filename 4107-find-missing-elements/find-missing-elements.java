class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int firele = nums[0];

        for(int i=0;i<nums.length;i++,firele++){
            if(firele<nums[i]){
                res.add(firele);
                i--;
            }
        }
        return res;
    }
}