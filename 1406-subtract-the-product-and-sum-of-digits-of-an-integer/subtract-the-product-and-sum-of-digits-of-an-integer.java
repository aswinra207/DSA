class Solution {
    public int subtractProductAndSum(int n) {
        int pr=1;
        int sum=0;
        while(n>0){
            int res=n%10;
            n/=10;
            pr*=res;
            sum+=res;
        }
        int result=pr-sum;
        
        return result;
    }
}