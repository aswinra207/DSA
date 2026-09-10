class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }    

        Set <Integer> res = new HashSet<>();
        for(int i : hm.values()){
            res.add(i);
        }   

        return res.size()==hm.size(); 
    }
}