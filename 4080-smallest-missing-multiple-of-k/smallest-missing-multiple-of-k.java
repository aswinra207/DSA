class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> res = new HashSet<>();
        for(int i : nums){
            res.add(i);
        }
        int i=1;
        while(true){
            int c = k*i;
            if(!res.contains(c)){
                break;
            }
                i++;
        }
        return k*i;
    }
}