class Solution {
    public int reverseDegree(String s) {
        int sum=0,prd=1;
        for(int i=0;i<s.length();i++){
            sum+=(123 - (int)s.charAt(i))*prd;
            prd++;
        }
        return sum;
        
    }
}