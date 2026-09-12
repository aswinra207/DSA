class Solution {
    public int strStr(String hay, String nee) {
        int h=hay.length();
        int n=nee.length();
        for(int i=0;i<=h-n;i++){
            int j=0;
            while(j<n && hay.charAt(i+j)==nee.charAt(j)){
                j++;
            }
            if(j==n) return i;

        }
        return -1;
    }
}