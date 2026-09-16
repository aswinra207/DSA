class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String o : operations){
            if("X++".equals(o) || "++X".equals(o)){
                x++;
            }else{
                x--;
            }
        }
        return x;
        
    }
}