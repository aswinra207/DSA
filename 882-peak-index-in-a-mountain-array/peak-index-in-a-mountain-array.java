class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return (l==r)? l : -1;
        
    }
}