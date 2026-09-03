class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        if(nums1.length==1) return true;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==1){
                min=Math.min(min,nums1[i]);
            }
        }
        if(min==Integer.MAX_VALUE) return true;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0 && nums1[i]<min){
                return false;
            }
        }
        return true;
        
    }
}