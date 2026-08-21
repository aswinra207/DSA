class Solution {
    public int[] singleNumber(int[] nums) {
        int [] res = new int[2];
        int index=0;
      
        for(int i=0;i<nums.length;i++){
               int count=1;
            for(int j=0;j<nums.length;j++){
                if(i != j && nums[i]==nums[j]){
                    count++;
                    
                }
            }
            if(count==1){
                res[index]=nums[i];
                index++;
            }
            if(index==2){
                return res;
            }  
        }
        return res;
        
    }
}