class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int[] i : matrix){
            for(int x : i){
                res.add(x);
            }
        } 
        Collections.sort(res);
        return res.get(k-1);
        
    }
}