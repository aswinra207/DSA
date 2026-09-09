class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int [s.length()];
        int pos=-10000;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) {
                pos=i;
            }
            res[i]=Math.abs(i-pos);
        }
        pos = 100000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pos = i;
            }
        res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }
}