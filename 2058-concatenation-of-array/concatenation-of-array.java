class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>li = new ArrayList<>();
        for (int i : nums){
            li.add(i);
        }
        for (int i : nums){
            li.add(i);
        }
        int[] res=new int[li.size()];
        for (int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;
        
    }
}