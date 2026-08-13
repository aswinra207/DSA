class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int maxyy=0;
        while(l<r){
            int res=Math.min(h[l],h[r])*(r-l);
            maxyy=Math.max(maxyy,res);
            if(h[l]<h[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxyy;


        

        
    }
}