class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int [nums.length];
        int in=0;
        for(int i : nums){
            int prd=i*i;
            arr[in]=prd;
            in++;
        }
        Arrays.sort(arr);
        return arr;
        
    }
}