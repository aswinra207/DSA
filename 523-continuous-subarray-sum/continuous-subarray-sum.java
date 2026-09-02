class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> res  =new HashMap<>();
        res.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(res.containsKey(rem)){
                if(i-res.get(rem)>1){
                    return true;
                }
            }else{
                res.put(rem,i);
            }
        }
        return false;
        
    }
}