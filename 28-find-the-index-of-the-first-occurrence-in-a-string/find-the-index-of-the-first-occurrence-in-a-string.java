class Solution {
    public int strStr(String hay, String nee) {
        for(int i=0,j=nee.length();j<=hay.length();i++,j++){
            if(hay.substring(i,j).equals(nee)){
                return i;
            }
        }
        return -1;
    }
}