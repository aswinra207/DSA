class Solution {
    public long countCommas(long n) {
        long c=0;
        long d=1000L;

        while(n>=d){
            c+=(n-d+1L);
            d*=1000L;
        }
        return c;
        
    }
}