class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 =new ArrayList<>();
        ArrayList<Integer> arr2 =new ArrayList<>();
        int indx1 = 0;
        int  indx2 = 0;
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            int lastarr1 = arr1.get(arr1.size() -1);
            int lastarr2 = arr2.get(arr2.size() -1);
            if(lastarr1>lastarr2){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int index=0;
        for(int i : arr1){
            res[index++]=i;
        }
        for(int i : arr2){
            res[index++]=i;
        }
        return res;
        
    }
}