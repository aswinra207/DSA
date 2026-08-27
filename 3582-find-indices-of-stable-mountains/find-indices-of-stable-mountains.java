class Solution {
    public List<Integer> stableMountains(int[] h, int th) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<h.length;i++){
            if (h[i-1]>th){
                res.add(i);
                
            }
        }
        return res;
    }
}