class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        int[] res = new int[len];
        int index=0;
        for(int i=0;i<m;i++){
            res[index]=nums1[i];
            index++;
        }
        for(int i=0;i<n;i++){
            res[index]=nums2[i];
            index++;
        }
        for(int i = 0; i < len; i++){
            nums1[i] = res[i];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}