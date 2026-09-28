class Solution {
    public int maxDepth(String s) {
        int d=0,md=0;
        for(char ch : s.toCharArray()){
            if(ch=='(') d++;
            if(d>md) md=d;
            else if(ch==')') d--;
        }
        return md;
    }
}