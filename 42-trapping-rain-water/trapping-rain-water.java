class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int lmax=h[0];
        int rmax=h[h.length-1];
        int stored=0;
        while(l<r){
            if(lmax<=rmax){
                l++;
                lmax=Math.max(lmax,h[l]);
                stored+=(lmax-h[l]);
            }else{
                r--;
                rmax=Math.max(rmax,h[r]);
                stored+=(rmax-h[r]);
            }
        }
        return stored;
        
    }
}