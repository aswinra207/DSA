class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1 =new ArrayList<>();
        for(int i : nums1){
            set1.add(i);
        }
        ArrayList<Integer> set2 =new ArrayList<>();
        for(int i : nums2){
            if(set1.contains(i)){
                set2.add(i);
                set1.remove(Integer.valueOf(i));
            }
        }
        int[] res = new int[set2.size()];
        int in=0;
        for(int i : set2){
            res[in++]=i;
        }
        return res;
        
    }
}