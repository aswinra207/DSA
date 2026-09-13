class Solution {
    public int[] constructRectangle(int num) {
        int start = (int) Math.sqrt(num);
        for(int i=start;i>=1;i--){
            if(num%i==0){
                int co = num/i;
                return new int[]{co,i};
            }
        }
        return new int[]{num,1};
        
    }
}