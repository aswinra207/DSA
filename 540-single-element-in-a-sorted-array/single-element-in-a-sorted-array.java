class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i : nums){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : res.entrySet()){
            if(entry.getValue()<=1){
                return entry.getKey();
            }
        }
        return -1;
    }
}