class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> res = new HashMap<>();
        HashMap<String,Integer> res1 = new HashMap<>();

        for(String i:words1){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        for(String i : words2){
            res1.put(i,res1.getOrDefault(i,0)+1);
        }
        int count=0;
        for(String s : res.keySet()){
            if(res.get(s)==1 && res1.getOrDefault(s,0)==1){
                count++;
            }
        }
        return count;
    }
}