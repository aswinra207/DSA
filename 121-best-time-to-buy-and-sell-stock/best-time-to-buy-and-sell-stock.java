class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int max= 0;
        for(int i:p){
            min=Math.min(i,min);
            int prof = i-min;
            max=Math.max(prof,max);

        }
        return max;
    }
}