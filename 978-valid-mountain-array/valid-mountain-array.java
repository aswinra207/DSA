class Solution {
    public boolean validMountainArray(int[] arr) {
        int c=0;
        if(arr.length<3){
            return false;
        }
        int l=0 ,r=arr.length-1;
        while(l<arr.length-1 && arr[l]<arr[l+1]){
            l++;
        }
        while(r>0 && arr[r]<arr[r-1]){
            r--;
        }
        return l==r && l!=0 && r!=arr.length-1;
    }
}