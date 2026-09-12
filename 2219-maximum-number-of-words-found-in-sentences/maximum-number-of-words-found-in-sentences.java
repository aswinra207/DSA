class Solution {
    public int mostWordsFound(String[] s) {
        int maxlen=0;
        for(String curr : s){
            int currlen=curr.split(" ").length;
            if(maxlen<currlen){
                maxlen=currlen;
            }
        }
        return maxlen;
    }
}