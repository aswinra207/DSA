class Solution {
    public int reverseDegree(String s) {
        int prd=1,sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(123 - (int)s.charAt(i))*prd;
            prd++;
        }
        return sum;
        
    }
}