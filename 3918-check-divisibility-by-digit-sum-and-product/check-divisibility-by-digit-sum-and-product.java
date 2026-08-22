import java.util.*; 
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prd=1;
        String[] digits=String.valueOf(n).split("");
        for(String i : digits){
            int d = Integer.parseInt(i);
            sum+=d;
            prd*=d;
        }
        int c= sum+prd;
        if(n%c==0){
            return true;
        }
        return false;
    }
}