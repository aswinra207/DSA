class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(int i : s.toCharArray()){
            sum-=i;
        }
        for(int j : t.toCharArray()){
            sum+=j;
        }
        return (char) sum;
        
    }
}