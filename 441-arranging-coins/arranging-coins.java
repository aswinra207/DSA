class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        for(int i=1;i<n;i++){
            n=n-i;
            if(n>i) count++;
        }
        return count;
    }
}