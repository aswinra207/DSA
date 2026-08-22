class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> cmap = new HashMap<>();
        for(int i : nums){
            cmap.put(i,cmap.getOrDefault(i,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : cmap.entrySet()){
            if(entry.getValue()>=2){
                res.add(entry.getKey());
            }
        }
        return res;
     }
}