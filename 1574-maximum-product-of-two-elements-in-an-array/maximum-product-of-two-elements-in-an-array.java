class Solution {
    public int maxProduct(int[] nums) {
        int c=Integer.MIN_VALUE;
       
        for (int i=0; i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                int prd=(nums[i]-1)*(nums[j]-1);
                c=Math.max(prd,c);
            }
        }
        return c;

       
    }
}