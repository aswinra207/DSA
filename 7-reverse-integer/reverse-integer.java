class Solution {
    public int reverse(int x) {
        int res=0;
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        
        boolean check=false;
        if(x<0){
            x=Math.abs(x);
            check=true;
        }
        while(x>0){
            if(res>Integer.MAX_VALUE/10  ){
            return 0;
        }
            res =res*10+  x%10;
            x/=10;
        }
       
        if(check){
            return res*-1;
        }
        return res;


        
    }
}